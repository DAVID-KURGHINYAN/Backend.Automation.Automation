package helpers;

import com.google.gson.Gson;
import helpers.enums.Roles;

public class BaseApi {
    protected final NetworkManager networkManager;
    protected final Gson gson;


    protected BaseApi() {
        this.networkManager = new NetworkManager();
        this.gson = new Gson();
    }
    protected String getCarrierList() {
        return "/api/Dispatcher/GetCarrierList";
    }
    protected String getUriAdminLogin() {

        return "/api/Auth/AdminLogin";
    }
    protected String getUrlAdmin(Roles role) {
        if (role == Roles.BranchAdmin) {
            return "/admin/orders/list";
        }
        return "";
    }
    protected String getUri(Roles role) {
        if (role == Roles.User) {
            return "/api/Auth/Login";
        } else if (role == Roles.Default || role == Roles.Guest) {
            return "null";
        }
        return "/api/Auth/AdminLogin";
    }
    protected String getUriAdmin(Roles role) {
        if (role == Roles.Admin) {
            return "/api/Admin";
        }
        return "null";
    }
    protected String getOrderById(Roles role) {
        if (role == Roles.Admin) {
            return "/api/order";
        }
        return "there is not api.";
    }
    protected String getUrlForProduct() {
        return "/api/Product/List";
    }
    protected String getUrlForDoctorList() {
        return "/api/Doctor/List";
    }
    protected String getUrlForFavorite() {
        return "/api/Favorite";
    }
    protected String getUrlOrderAdminList(Roles role) {
        if (role == Roles.Admin) {
            return "/api/Order/AdminList";
        }
        return "You are not authorized";
    }
    protected String getUriDashboard(Roles role) {
        if (role == Roles.Admin) {
            return "/api/Order/Dashboard";
        }
        return "You are not authorized";
    }
    protected String getUriCategory() {
        return "/api/Category";
    }
    protected String getByDispatcherAdvanced(Roles role) {
        if (role == Roles.Admin) {
            return "/api/order/GetByDispatcherAdvanced";
        }
        return "You are not authorized";
    }
    protected String getUriAvailabilityById(Roles role) {
        if (role == Roles.Admin) {
            return "/api/product/availablity";
        }
        return "You are not authorized";
    }
    protected String getUriCarrier(Roles role) {
        if (role == Roles.Admin) {
            return "/api/dispatcher/getCarrier";
        }
        return "There isn't api";
    }
    protected String getUriEditCarrier(Roles role) {
        if (role == Roles.Admin) {
            return "/api/dispatcher/editCarrier";
        }
        return "There isn't api";
    }
    protected String getUriUserList(Roles role) {
        if (role == Roles.Admin) {
            return "/api/User/List";
        }
        return "There isn't api";
    }
    protected String getUriProducerList(Roles role) {
        if (role==Roles.Admin){
            return "/api/producer/list";
        }
        return "There isn't api";
    }
    protected String getUriBrandList(Roles role){
        if (role==Roles.Admin){
            return "/api/brand/list";
        }
        return "There isn't api";
    }
    protected String getUriActiveIngredient(Roles role){
        if (role==Roles.Admin){
            return "/api/activeIngredient/list";
        }
        return "There isn't api";
    }
    protected String getUriVacancyById(Roles role) {
        if (role==Roles.Admin){
            return "/api/vacancy/";
        }
        return "There isn't api";
    }
    protected String getUriPharmacyBranchList(Roles role) {
        if (role==Roles.Admin){
            return "/api/pharmacyBranch/list";
        }
        return "Ther isn't api";
    }
    protected String getUriPlaceCityById(Roles role) {if (role==Roles.Admin){return "/api/place/city/";}return "There isn't api";}
}
