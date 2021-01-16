package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Publisher {
    private String name;
    private String id;
    private LocalDateTime published_from;
    private LocalDateTime published_to;
    private int sum_content_length;
    private int avg_content_length;
    private int numOfArticles;

    public Publisher(String name, String id, LocalDateTime published_from, LocalDateTime published_to, int sum_content_length) {
        this.name = name;
        this.id = id;
        this.published_from = published_from;
        this.published_to = published_to;
        this.sum_content_length = sum_content_length;
        this.numOfArticles = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getPublished_from() {
        return published_from;
    }

    public void setPublished_from(LocalDateTime published_from) {
        this.published_from = published_from;
    }

    public LocalDateTime getPublished_to() {
        return published_to;
    }

    public void setPublished_to(LocalDateTime published_to) {
        this.published_to = published_to;
    }

    public int getSum_content_length() {
        return sum_content_length;
    }

    public void setSum_content_length(int sum_content_length) {
        this.sum_content_length = sum_content_length;
    }

    public int getAvg_content_length() {
        return avg_content_length;
    }

    public void setAvg_content_length(int avg_content_length) {
        this.avg_content_length = avg_content_length;
    }

    public int getNumOfArticles() {
        return numOfArticles;
    }

    public void setNumOfArticles(int numOfArticles) {
        this.numOfArticles = numOfArticles;
    }

    public void calculate_avg_content_length() {
        this.avg_content_length = sum_content_length/numOfArticles;
    }

    @Override
    public String toString() {
        return name + " " + id + " " + published_from + " " + published_to + " " + avg_content_length + "\n";
    }
}
