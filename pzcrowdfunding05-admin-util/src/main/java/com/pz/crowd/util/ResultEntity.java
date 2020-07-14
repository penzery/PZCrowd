package com.pz.crowd.util;

/*
   ajax请求返回json数据统一格式用ResultEntity返回
 */
public class ResultEntity<T> {

    public static final String SUCCESS="SUCCESS";
    public static final String FAILED="FAILED";

    //用来封装当前请求处理的结果成功或失败
    private String result;
    //请求处理失败时返回的消息
    private String message;
    //请求处理成功返回的数据
    private T data;

    public ResultEntity() {
    }

    public ResultEntity(String result, String message, T data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }

    public static <Type> ResultEntity<Type> successWithoutData(){
        return new ResultEntity<Type>(SUCCESS,null,null);
    }

    public static <Type> ResultEntity<Type> failed(String message){
        return new ResultEntity<Type>(FAILED,message,null);
    }

    public static <Type> ResultEntity<Type> successWithData(Type data){
        return new ResultEntity<Type>(SUCCESS,null,data);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
