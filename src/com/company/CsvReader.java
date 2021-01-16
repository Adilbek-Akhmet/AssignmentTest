package com.company;

import com.opencsv.CSVReader;

import java.io.FileReader;

import static com.company.ArticleList.articles;
import static com.company.ArticleList.createArticle;

public class CsvReader implements Runnable {
    private String filePath;

    public CsvReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
            try {

                FileReader filereader = new FileReader(filePath);

                CSVReader csvReader = new CSVReader(filereader);
                String[] nextRecord;

                csvReader.readNext();
                while ((nextRecord = csvReader.readNext()) != null) {
                    String[] articleInfo = new String[6];
                    int index = 0;
                    for (String cell : nextRecord) {
                        articleInfo[index] = cell;
//                        System.out.print(cell + "\t");
                        if (index == articleInfo.length) {
                            break;
                        }
                        index++;
                    }
                    createArticle(articleInfo);
//                    System.out.println();
                }
                PublisherList.createReports();

            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
