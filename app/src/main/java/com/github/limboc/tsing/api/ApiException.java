package com.github.limboc.tsing.api;


public class ApiException extends RuntimeException {

    public static final int REQUEST_ERROR = 400;
    public static final int WRONG_PASSWORD = 101;

    public ApiException(int resultCode) {
        this(getApiExceptionMessage(resultCode));
    }

    public ApiException(String detailMessage) {
        super(detailMessage);
    }

    /**
     * @param code
     * @return
     */
    private static String getApiExceptionMessage(int code){
        String message = "";
        switch (code) {
            case REQUEST_ERROR:
                message = "错误请求";
                break;
            case WRONG_PASSWORD:
                message = "密码错误";
                break;
            default:
                message = "未知错误";

        }
        return message;
    }
}

