package com.github.fish56.json.fastjson;

import com.alibaba.fastjson.JSONObject;
import com.github.fish56.json.entity.Article;
import com.github.fish56.json.entity.User;
import org.junit.Assert;
import org.junit.Test;

public class Ignore {
    /**
     * 测试在序列化的时候是否可以忽略某些字段
     */
    @Test
    public void field(){
        User user = new User();
        user.setId(32);
        user.setName("Jon");
        user.setPassword("123456");
        System.out.println(JSONObject.toJSONString(user));
        // {"id":32,"name":"Jon"}
    }
}
