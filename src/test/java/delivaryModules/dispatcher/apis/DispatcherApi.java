package delivaryModules.dispatcher.apis;

import com.google.gson.reflect.TypeToken;
import delivaryModules.dispatcher.models.request.ReqDispatcherGetCarrierList;
import delivaryModules.dispatcher.models.response.ResDispatcherGetCarrierList;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import helpers.enums.Urls;

import java.lang.reflect.Type;

public class DispatcherApi extends BaseApi {
    public ResponseModel<ResDispatcherGetCarrierList> getCarrierListApi(ReqDispatcherGetCarrierList model, Roles role){
        String json = gson.toJson(model);
        Response response = networkManager.Post(json,getCarrierList(),"", Languages.hy, Urls.Delivery,role);
        Type type = new TypeToken<ResponseModel<ResDispatcherGetCarrierList>>(){}.getType();
        ResponseModel<ResDispatcherGetCarrierList> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;
    }
}
