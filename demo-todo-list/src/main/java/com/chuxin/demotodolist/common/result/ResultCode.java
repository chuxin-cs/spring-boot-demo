package com.chuxin.demotodolist.common.result;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public enum ResultCode implements IResultCode,Serializable {
    // 此处 code 200 201 为演示随意写的 不适用真实项目取值~
    SUCCESS(200, "操作成功"), ERROR(201, "操作失败");

    private int code;
    private String msg;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
    // 获取value值，此处的操作和数组 find 一个功能，找到了就返回 没找到就 走 ERROR 这个枚举 不过 js 是 undefined
    public static ResultCode getValue(int code) {
        for (ResultCode value : values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        return ERROR; // 默认系统执行错误
    }
}
