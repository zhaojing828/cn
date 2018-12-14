package net.jdcloud.PetStore;

import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.http.Protocol;
import net.jdcloud.PetStore.client.PetStoreClient;
import net.jdcloud.PetStore.model.ApiName0Response;
import net.jdcloud.PetStore.model.ApiName0Request;
import net.jdcloud.PetStore.model.ApiName1Response;
import net.jdcloud.PetStore.model.ApiName1Request;
import net.jdcloud.PetStore.model.ReqBody;
import com.google.gson.Gson;
import java.math.BigDecimal;


public class SDKTest {
    public static void main (String[] args){
        String accessKeyId = "5A327AA1AD791A49F358A7E1325E414C"; //APIKey
        String secretAccessKey = "9FD89EF6099EB319FCD36C525B517047"; //APISecret
        CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretAccessKey);
        PetStoreClient client = PetStoreClient.builder()
                .credentialsProvider(credentialsProvider)
                .httpRequestConfig(new HttpRequestConfig.Builder().protocol(Protocol.HTTP).build()) //默认为HTTPS
                .build();
//        ApiName0
        ApiName0Request request = new ApiName0Request();
        request.setPetId("1");
        ApiName0Response response = client.apiName0(request);
        System.out.println(new Gson().toJson(response));

//        ApiName1
        ApiName1Request request1 = new ApiName1Request();
        ReqBody reqBody1 = new ReqBody();
        reqBody1.setId(1);
        reqBody1.setPrice(new BigDecimal(3.3));
        reqBody1.setType("dog");
        request1.setReqBody(reqBody1);
        ApiName1Response response1 = client.apiName1(request1);
        System.out.println(new Gson().toJson(response1));
    }
}
