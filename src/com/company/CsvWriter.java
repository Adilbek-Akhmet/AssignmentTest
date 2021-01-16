package com.company;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {
    public static void writeDataLineByLine(String filePath)
    {
        String info = PublisherList.getAllPublishers();
        File file = new File(filePath);
        try {

            FileWriter outputfile = new FileWriter(file);

            CSVWriter writer = new CSVWriter(outputfile, ',', CSVWriter.NO_QUOTE_CHARACTER);

            String[] data = {info};
            writer.writeNext(data);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
