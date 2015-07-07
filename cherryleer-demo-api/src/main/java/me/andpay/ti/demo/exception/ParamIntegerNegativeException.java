package me.andpay.ti.demo.exception;

/**
 * Integer为负异常
 *
 * @author : cherryleer
 */
public class ParamIntegerNegativeException extends RuntimeException{
    private static final long serialVersionUID = -6703812400702358923L;

    private String errorCode = "1002";
    private String errorMessage = "Parameter Integer negative exception.";

    public ParamIntegerNegativeException() {
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
