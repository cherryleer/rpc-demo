package com.cherryleer.rpc.demo.exception;

/**
 * Created by cherryleer on 7/8/15.
 */
public enum ErrorCode {

    SYSTEM_ERROR(5001, "system error"),
    PARAM_NULL(5001, "parameter null error"),
    INTEGER_NEGATIVE(5002, "integer parameter negative error"),


    ADD_MESSAGE_ERROR(5103, "add message error");

    private int code;
    private String description;

    private ErrorCode(int code, String description){
        this.code = code;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public int getCode(){
        return code;
    }
}
