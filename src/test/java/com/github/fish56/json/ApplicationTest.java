package com.github.fish56.json;

import com.github.fish56.json.entity.Article;
import org.junit.BeforeClass;

public class ApplicationTest {
    protected static Article article;

    @BeforeClass
    public static void init(){
        article = new Article();
        article.setId(22);
        article.setTitle("Json入门");
        article.setLabel(Article.Label.Locked);
        System.out.println(11111);
    }
}
