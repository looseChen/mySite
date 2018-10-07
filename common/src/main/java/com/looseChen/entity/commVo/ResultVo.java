package com.looseChen.entity.commVo;

/**
 * @Auther: looseChen
 * @CreateDate: 2018/10/7 16:18
 * @Description: 公共ResultVo , code默认1为成功
 */
public class ResultVo<T> {
    private Integer code;
    private String msg;
    private T data;

    public ResultVo(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVo(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResultVo getSuccess(String msg) {
        return new ResultVo(1, msg);
    }

    public static <T> ResultVo getSuccess(String msg, T data) {
        return new ResultVo(1, msg, data);
    }

    public static ResultVo getFailed(Integer code ,String msg) {
        return new ResultVo(code, msg);
    }

    public static <T> ResultVo getFailed(Integer code ,String msg, T data) {
        return new ResultVo(code, msg, data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
