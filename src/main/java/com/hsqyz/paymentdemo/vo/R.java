package com.hsqyz.paymentdemo.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一结果集
 */
@Data
@Accessors(chain = true) // Lombok提供的链式调用注解，当chain设置为true时，生成的setter方法返回this（当前对象）
public class R {

    /**
     * 响应码 响应消息 数据
     */
    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap<>();

    public static R ok(){
        R r = new R();
        r.setCode(0);
        r.setMessage("成功");
        return r;
    }

    public static R error(){
        R r = new R();
        r.setCode(-1);
        r.setMessage("失败");
        return r;
    }

    public R data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

}
