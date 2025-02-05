package org.example.filereader.readfile;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        String filePath = "C:\\College\\Capgemini\\Week03\\Day05\\src\\main\\java\\org\\example\\filereader\\readfile\\sample";

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

            br.close();
        }
        catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
