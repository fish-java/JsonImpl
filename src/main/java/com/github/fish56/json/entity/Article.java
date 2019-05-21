package com.github.fish56.json.entity;

import lombok.Data;

@Data
public class Article {
    private Integer id;
    private String title;

    private Label label;

    public enum Label{
        Normal, Locked
    }
}
