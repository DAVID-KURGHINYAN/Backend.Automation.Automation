package helpers;

public class ResponseModel<T> {
    public T data;
    public String message;
    public boolean success;
    public int statusCode;
}
