package com.anhe.utils;

public class BaseResult<T extends Object> {

    private Integer code;

    private Boolean success;

    private T data;

    private String message;

    public BaseResult() {
    }

    public BaseResult(T data) {
        this.data = data;
        this.success=true;
    }

    public BaseResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResult(Integer code, Boolean success, T data, String message) {
        this.code = code;
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
