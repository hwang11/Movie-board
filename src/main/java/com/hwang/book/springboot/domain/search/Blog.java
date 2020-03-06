package com.hwang.book.springboot.domain.search;

import lombok.Getter;

import java.util.List;

@Getter
public class Blog extends Result {
    private int total;
    private int start;
    private int display;
    private List<Item> items;

    @Getter
    public static class Item {
        private String title;
        private String link;
        private String description;
        private String bloggername;
        private String bloggerlink;
    }
}
