package me.andpay.ti.demo.exception;

/**
 * 参数空异常
 *
 * @author : cherryleer
 */
public class ParamNullException extends RuntimeException{
    private static final long serialVersionUID = -6703856400702358923L;

    private String errorCode = "1001";
    private String errorMessage = "Parameter null exception.";

    public ParamNullException() {
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
