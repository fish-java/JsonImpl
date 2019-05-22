package com.github.fish56.json.entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * https://github.com/alibaba/fastjson/wiki/JSONField
 * 序列化的时候的一些设置
 */
public class User {
    private Integer id;
    private String name;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JSONField(serialize = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
