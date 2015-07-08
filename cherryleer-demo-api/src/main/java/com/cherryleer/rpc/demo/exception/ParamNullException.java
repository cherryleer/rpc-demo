package com.cherryleer.rpc.demo.exception;

/**
 * 参数空异常
 *
 * @author : cherryleer
 */
public class ParamNullException extends RuntimeException{
    private static final long serialVersionUID = -6703856400702358923L;

    private Integer errorCode = ErrorCode.PARAM_NULL.getCode();
    private String errorMessage = ErrorCode.PARAM_NULL.getDescription();

    public ParamNullException() {
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
