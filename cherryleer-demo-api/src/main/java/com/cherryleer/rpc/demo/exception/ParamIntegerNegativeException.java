package com.cherryleer.rpc.demo.exception;

/**
 * Integer为负异常
 *
 * @author : cherryleer
 */
public class ParamIntegerNegativeException extends RuntimeException{
    private static final long serialVersionUID = -6703812400702358923L;

    private Integer errorCode = ErrorCode.INTEGER_NEGATIVE.getCode();
    private String errorMessage = ErrorCode.INTEGER_NEGATIVE.getDescription();

    public ParamIntegerNegativeException() {
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
