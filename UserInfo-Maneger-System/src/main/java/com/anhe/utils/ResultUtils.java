package com.anhe.utils;

public class ResultUtils {

    public static BaseResult fail(String message) {
        return new BaseResult(200, false, null, message);
    }

    public static BaseResult success(Object data) {
        return new BaseResult(200, true, data, "请求成功");
    }
}
