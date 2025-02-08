package org.example.largefilereading;

import java.io.*;

public class LargeFileReading {

    public static void fileReaderPerform(String filePath){
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            while (br.readLine() != null){

            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void inputStreamReaderPerform(String filePath){
        try {
            FileInputStream fs = new FileInputStream(filePath);
            InputStreamReader fr = new InputStreamReader(fs);
            BufferedReader br = new BufferedReader(fr);

            while (br.readLine() != null){

            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        String filePath = "C:\\College\\Capgemini\\Week03\\Day06\\src\\main\\java\\org\\example\\largefilereading\\sample";

        long startTime1 = System.nanoTime();
        LargeFileReading.fileReaderPerform(filePath);
        long endTime1 = System.nanoTime();
        System.out.println("Time taken by file reader to read a file: " + (endTime1 - startTime1));

        long startTime2 = System.nanoTime();
        LargeFileReading.inputStreamReaderPerform(filePath);
        long endTime2 = System.nanoTime();
        System.out.println("Time taken by input stream reader to read a file: " + (endTime2 - startTime2));
    }
}
