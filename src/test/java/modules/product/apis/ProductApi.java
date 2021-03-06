package modules.product.apis;

import com.google.gson.reflect.TypeToken;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import helpers.enums.Urls;
import modules.product.models.request.ReqProductListModel;
import modules.product.models.response.ResProductAvailabilityById;
import modules.product.models.response.ResProductList;

import java.lang.reflect.Type;

public class ProductApi extends BaseApi {


    public ResponseModel<ResProductList> getProductList(ReqProductListModel model,Roles role){
        String json = gson.toJson(model);
        Response response = networkManager.Post(json,getUrlForProduct(),"",Languages.hy, Urls.Back, role);
        Type type = new TypeToken<String>(){}.getType();
        ResponseModel<ResProductList> responseModel = gson.fromJson(response.responseText, type);
        responseModel.statusCode=response.statusCode;
        return responseModel;
    }

    public ResponseModel<ResProductAvailabilityById> getProductAvailability(Roles role){
        String id = "/5893";
        Response response = networkManager.Get(getUriAvailabilityById(role),id,Languages.hy,Urls.Back,role);
        Type type = new TypeToken<ResponseModel<ResProductAvailabilityById>>(){}.getType();
        ResponseModel<ResProductAvailabilityById> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;
    }
}
