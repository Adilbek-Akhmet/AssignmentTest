package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class ArticleList {
    public static ArrayList<Article> articles = new ArrayList<>();

    public static void createArticle(String[] articleInfo) {
        if (articleInfo[5].contains(".")){
            articleInfo[5] = articleInfo[5].split("\\.")[0];
        }else if (articleInfo[5].contains("+")){
            articleInfo[5] = articleInfo[5].split("\\+")[0];
        }
        else {
            articleInfo[5] = articleInfo[5].split("Z")[0];
        }
        articleInfo[5] = articleInfo[5].replaceAll("T", " ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse(articleInfo[5], formatter);
        articles.add(new Article(articleInfo[0], articleInfo[1], articleInfo[2], articleInfo[3], articleInfo[4], date));
    }
}
