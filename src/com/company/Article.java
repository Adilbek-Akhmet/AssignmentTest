package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Article {
    private String id;
    private String source_id;
    private String source_name;
    private String title;
    private String content;
    private LocalDateTime published_at;

    public Article(String id, String source_id, String source_name, String title, String content, LocalDateTime date) {
        this.id = id;
        this.source_id = source_id;
        this.source_name = source_name;
        this.title = title;
        this.content = content;
        this.published_at = date;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource_id() {
        return source_id;
    }

    public void setSource_id(String source_id) {
        this.source_id = source_id;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getPublished_at() {
        return published_at;
    }

    public void setPublished_at(LocalDateTime published_at) {
        this.published_at = published_at;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
