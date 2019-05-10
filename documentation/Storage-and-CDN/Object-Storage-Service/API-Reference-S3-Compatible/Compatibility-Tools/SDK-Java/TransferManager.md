# TransferManager

## 概述
您可以使用 AWS SDK for Java [TransferManager](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/index.html?com/amazonaws/services/s3/transfer/TransferManager.html)类进行上传、下载以及获取传输进度。更多详细说明请参考[AWS SDK for Java/TransferManager](https://docs.aws.amazon.com/zh_cn/sdk-for-java/v1/developer-guide/examples-s3-transfermanager.html?shortFooter=true)。

### 初始化TransferManager

使用TransferManager传输前，需要初始化TransferManager实例，示例如下：

```Java
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.TransferManagerBuilder;

public class S3SdkTest{
    public static void main(String[ ] args)  {
        final String accessKey = "<your accesskey>";
        final String secretKey = "<your secretkey>";
        final String endpoint = "https://s3.<REGION>.jdcloud-oss.com";
        ClientConfiguration config = new ClientConfiguration();
 
        AwsClientBuilder.EndpointConfiguration endpointConfig =
                new AwsClientBuilder.EndpointConfiguration(endpoint, "<REGION>");
 
        AWSCredentials awsCredentials = new BasicAWSCredentials(accessKey,secretKey);
        AWSCredentialsProvider awsCredentialsProvider = new AWSStaticCredentialsProvider(awsCredentials);
        //初始化s3实例
        AmazonS3 s3 = AmazonS3Client.builder()
                .withEndpointConfiguration(endpointConfig)
                .withClientConfiguration(config)
                .withCredentials(awsCredentialsProvider)
                .disableChunkedEncoding()
                .withPathStyleAccessEnabled(true)
                .build();
        //初始化TransferManager实例
        TransferManager xfer_mgr = TransferManagerBuilder.standard()
                .withS3Client(s3)
                .build();
        
        //使用xfer_mgr进行上传下载......
    }
}
```

## 上传
TransferManager 可将单个文件或整个目录上传到存储桶中。
### 上传单个文件
```Java
String bucket_name = "your-bucket";
String key_name = "your-key";
String file_path = "your-path";

File f = new File(file_path);

try {
    //上传文件（支持5G以上文件）
    Upload xfer = xfer_mgr.upload(bucket_name, key_name, f);
    //检查传输状态
    XferMgrProgress.showTransferProgress(xfer);
    //等待传输完成
    XferMgrProgress.waitForCompletion(xfer);
} catch (AmazonServiceException e) {
    System.err.println(e.getErrorMessage());
    System.exit(1);
}
```

### 上传目录
```Java
String bucket_name = "your-bucket";
String key_prefix = "your-prefix";
String dir_path = "your-path";

try {
    //上传dir_path目录下所有文件（包含子目录）
    MultipleFileUpload xfer = xfer_mgr.uploadDirectory(bucket_name,
            key_prefix, new File(dir_path), true);
    //检查传输状态
    XferMgrProgress.showMultiUploadProgress(xfer);
    //等待传输完成
    XferMgrProgress.waitForCompletion(xfer);
} catch (AmazonServiceException e) {
    System.err.println(e.getErrorMessage());
    System.exit(1);
}
```

## 下载
TransferManager可将单个对象或整个目录下载到本地。
### 下载单个对象
```Java
String bucket_name = "your-bucket";
String key_name = "your-key";
String file_path = "your-path";

File f = new File(file_path);

try {
    Download xfer = xfer_mgr.download(bucket_name, key_name, f);
    //检查传输状态
    XferMgrProgress.showTransferProgress(xfer);
    //等待传输完成
    XferMgrProgress.waitForCompletion(xfer);
} catch (AmazonServiceException e) {
    System.err.println(e.getErrorMessage());
    System.exit(1);
}
```
### 下载目录
```Java
String bucket_name = "your-bucket";
String key_prefix = "your-prefix";
String dir_path = "your-path";

try {
    MultipleFileDownload xfer = xfer_mgr.downloadDirectory(
            bucket_name, key_prefix, new File(dir_path));
    //检查传输状态
    XferMgrProgress.showTransferProgress(xfer);
    //等待传输完成
    XferMgrProgress.waitForCompletion(xfer);
} catch (AmazonServiceException e) {
    System.err.println(e.getErrorMessage());
    System.exit(1);
}
```

## 获取传输进度
XferMgrProgress类提供waitForCompletion、showTransferProgress、showMultiUploadProgress等静态方法。
```Java
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.transfer.MultipleFileUpload;
import com.amazonaws.services.s3.transfer.Transfer;
import com.amazonaws.services.s3.transfer.Transfer.TransferState;
import com.amazonaws.services.s3.transfer.TransferProgress;
import com.amazonaws.services.s3.transfer.Upload;

import java.util.ArrayList;
import java.util.Collection;

public class XferMgrProgress
{
    // waits for the transfer to complete, catching any exceptions that occur.
    public static void waitForCompletion(Transfer xfer)
    {
        try {
            xfer.waitForCompletion();
        } catch (AmazonServiceException e) {
            System.err.println("Amazon service error: " + e.getMessage());
            System.exit(1);
        } catch (AmazonClientException e) {
            System.err.println("Amazon client error: " + e.getMessage());
            System.exit(1);
        } catch (InterruptedException e) {
            System.err.println("Transfer interrupted: " + e.getMessage());
            System.exit(1);
        }
    }

    // Prints progress while waiting for the transfer to finish.
    public static void showTransferProgress(Transfer xfer)
    {
        // print the transfer's human-readable description
        System.out.println(xfer.getDescription());
        // print an empty progress bar...
        printProgressBar(0.0);
        // update the progress bar while the xfer is ongoing.
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                return;
            }
            // Note: so_far and total aren't used, they're just for
            // documentation purposes.
            TransferProgress progress = xfer.getProgress();
            long so_far = progress.getBytesTransferred();
            long total = progress.getTotalBytesToTransfer();
            double pct = progress.getPercentTransferred();
            eraseProgressBar();
            printProgressBar(pct);
        } while (xfer.isDone() == false);
        // print the final state of the transfer.
        TransferState xfer_state = xfer.getState();
        System.out.println(": " + xfer_state);
    }

    // Prints progress of a multiple file upload while waiting for it to finish.
    public static void showMultiUploadProgress(MultipleFileUpload multi_upload)
    {
        // print the upload's human-readable description
        System.out.println(multi_upload.getDescription());

        Collection<? extends Upload> sub_xfers = new ArrayList<Upload>();
        sub_xfers = multi_upload.getSubTransfers();

        do {
            System.out.println("\nSubtransfer progress:\n");
            for (Upload u : sub_xfers) {
                System.out.println("  " + u.getDescription());
                if (u.isDone()) {
                    TransferState xfer_state = u.getState();
                    System.out.println("  " + xfer_state);
                } else {
                    TransferProgress progress = u.getProgress();
                    double pct = progress.getPercentTransferred();
                    printProgressBar(pct);
                    System.out.println();
                }
            }

            // wait a bit before the next update.
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                return;
            }
        } while (multi_upload.isDone() == false);
        // print the final state of the transfer.
        TransferState xfer_state = multi_upload.getState();
        System.out.println("\nMultipleFileUpload " + xfer_state);
    }

    // prints a simple text progressbar: [#####     ]
    public static void printProgressBar(double pct)
    {
        // if bar_size changes, then change erase_bar (in eraseProgressBar) to
        // match.
        final int bar_size = 40;
        final String empty_bar = "                                        ";
        final String filled_bar = "########################################";
        int amt_full = (int)(bar_size * (pct / 100.0));
        System.out.format("  [%s%s]", filled_bar.substring(0, amt_full),
                empty_bar.substring(0, bar_size - amt_full));
    }

    // erases the progress bar.
    public static void eraseProgressBar()
    {
        // erase_bar is bar_size (from printProgressBar) + 4 chars.
        final String erase_bar = "\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b";
        System.out.format(erase_bar);
    }
}
```



