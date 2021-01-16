package com.company;

import com.opencsv.CSVReader;

import java.io.*;
import java.util.ArrayList;

import static com.company.ArticleList.createArticle;
import static com.company.PublisherList.publishers;

public class Main {



    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        ArrayList<CsvReader> list = new ArrayList<>();
        ArrayList<Thread> threads = new ArrayList<>();
        String[] filePaths = {
                "part1.csv",
                "part2.csv",
                "part3.csv",
                "part4.csv"
        };

        for (int i = 0; i < filePaths.length; i++) {
            list.add(new CsvReader(filePaths[i]));
        }
        for (int i = 0; i < list.size(); i++) {
            threads.add(i, new Thread(list.get(i)));
            threads.get(i).start();
        }
        for (int i = 0; i < list.size(); i++) {
            threads.get(i).join();
        }
        CsvWriter.writeDataLineByLine("report.csv");
    }
}
