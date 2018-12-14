# coding=utf8

from jdcloud_sdk.core.credential import Credential
from jdcloud_sdk.core.config import Config
from jdcloud_sdk.core.const import SCHEME_HTTP
from PetStore.apis.create_pet_request import *
from PetStore.apis.get_pet_info_request import *
from PetStore.client.PetStore_client import PetStoreClient
from PetStore.models.body import Body


class PetStoreTest(object):

    def __init__(self, access_key, secret_key, end_point):
        self.access_key = access_key
        self.secret_key = secret_key
        self.end_point = end_point
        self.credential = Credential(self.access_key, self.secret_key)
        self.config = Config(self.end_point, scheme=SCHEME_HTTP)
        self.client = PetStoreClient(self.credential, self.config)

    def create_pet_test(self):
        req_body = Body(id=1, type="dog", price=12).to_dict()
        parameters = CreatePetParameters()
        request = CreatePetRequest(parameters=parameters, bodyParameters=req_body)
        res = self.client.send(request)
        return res

    def get_pet_info_test(self):
        parameters = GetPetInfoParameters(petId=1)
        request = GetPetInfoRequest(parameters=parameters, bodyParameters=None)
        res = self.client.send(request)
        return res


if __name__ == "__main__":
    # 访问密钥详细信息中的APIKey
    APIKey = "5A327AA1AD791A49F358A7E1325E414C"
    # 访问密钥详细信息中的APISecert
    APISecert = "9FD89EF6099EB319FCD36C525B517047"
    # API分组信息中分组路径去掉前缀的部分
    endpoint = "xv3xbwah945y.cn-north-1.jdcloud-api.net"

    pet_store = PetStoreTest(APIKey, APISecert, endpoint)
    print pet_store.create_pet_test().content
    print pet_store.get_pet_info_test().content
