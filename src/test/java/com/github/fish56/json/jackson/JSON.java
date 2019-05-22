package com.github.fish56.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fish56.json.ApplicationTest;
import org.junit.BeforeClass;
import org.junit.Test;

public class JSON extends ApplicationTest {
    private static ObjectMapper mapper;

    @BeforeClass
    public static void init(){
        mapper = new ObjectMapper();
    }

    @Test
    public void stringify() throws Exception{
        String articleString = mapper.writeValueAsString(article);
        System.out.println(articleString);
        // null ???
    }
}
