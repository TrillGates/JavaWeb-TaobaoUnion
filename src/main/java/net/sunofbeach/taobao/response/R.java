package net.sunofbeach.taobao.response;


import java.io.Serializable;

public class R implements Serializable {

    public R() {
        
    }

    //操作是否成功
    boolean success;

    //操作代码
    int code;

    //提示信息
    String message;

    private Object data;

    public R(CommonCode resultCode) {
        this.success = resultCode.success;
        this.code = resultCode.code;
        this.message = resultCode.message;
    }

    public static R SUCCESS() {
        return new R(CommonCode.SUCCESS);
    }

    public static R SUCCESS(String msg) {
        R responseResult = new R(CommonCode.SUCCESS);
        responseResult.setMessage(msg);
        return responseResult;
    }

    public static R FAILED(String msg) {
        R responseResult = new R(CommonCode.FAIL);
        responseResult.setMessage(msg);
        return responseResult;
    }


    public static R FAILED() {
        return new R(CommonCode.FAIL);
    }

    public R setData(Object data) {
        this.data = data;
        return this;
    }

    public Object getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
