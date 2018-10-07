package com.looseChen.exception;

/**
 * @Auther: looseChen
 * @CreateDate: 2018/10/4 19:18
 * @Description: 自定义异常
 */
public class MyException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private int code;
    private String msg;

    public MyException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public MyException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
