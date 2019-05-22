package com.github.fish56.json.fastjson;

import com.alibaba.fastjson.JSONObject;
import com.github.fish56.json.entity.Article;
import org.junit.Assert;
import org.junit.Test;

public class Enums {
    /**
     * 测试下枚举值会如何的解析
     */
    @Test
    public void enumValue(){
        Article article = new Article();
        article.setId(22);
        article.setTitle("Json入门");
        article.setLabel(Article.Label.Locked);

        System.out.println(JSONObject.toJSONString(article));
        // {"id":22,"label":"Locked","title":"Json入门"}
    }

    /**
     * 测试字符解析成枚举值
     */
    @Test
    public void parseEnumValue(){
        String json = "{\"id\":22,\"label\":\"Normal\",\"title\":\"Json入门\"}";
        Article article = JSONObject.parseObject(json, Article.class);
        System.out.println(article.getLabel());
        Assert.assertSame(Article.Label.Normal, article.getLabel());
    }

    /**
     * 测试下错误的枚举值
     */
    @Test
    public void parseEnumValueError(){
        String json = "{\"id\":22,\"label\":\"xxxx\",\"title\":\"Json入门\"}";
        Article article = JSONObject.parseObject(json, Article.class);
        System.out.println(article.getLabel()); // null
    }
}
