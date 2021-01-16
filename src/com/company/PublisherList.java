package com.company;

import java.util.ArrayList;

import static com.company.ArticleList.articles;

public class PublisherList {
    public static final ArrayList<Publisher> publishers = new ArrayList<>();

    public static void createReports(){
        synchronized (publishers) {
            boolean isFound;
            for (int i = 0; i < articles.size(); i++) {
                isFound = false;
                for (int j = 0; j < publishers.size(); j++) {
                    if (publishers.get(j).getId().equals(articles.get(i).getSource_id())) {
                        publishers.get(j).setNumOfArticles(publishers.get(j).getNumOfArticles() + 1);
                        isFound = true;
                        publishers.get(j).setSum_content_length(articles.get(i).getContent().length() + publishers.get(j).getSum_content_length());
                        if (articles.get(i).getPublished_at().isBefore(publishers.get(j).getPublished_from())) {
                            publishers.get(j).setPublished_from(articles.get(i).getPublished_at());
                        }
                        if (articles.get(i).getPublished_at().isAfter(publishers.get(j).getPublished_to())) {
                            publishers.get(j).setPublished_to(articles.get(i).getPublished_at());
                        }
                    }
                }
                if (!isFound) {
                    publishers.add(new Publisher(articles.get(i).getSource_name(), articles.get(i).getSource_id(),  articles.get(i).getPublished_at(), articles.get(i).getPublished_at(), articles.get(i).getContent().length()));
                }
            }
            for (int i = 0; i < publishers.size(); i++) {
                publishers.get(i).calculate_avg_content_length();
            }
        }
    }

    public static String getAllPublishers() {
        String info = "";
        for (int i = 0; i < publishers.size(); i++) {
            info += publishers.get(i);
            info += "\n";
        }
        return info;
    }
}
