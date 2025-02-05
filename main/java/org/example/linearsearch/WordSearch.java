package org.example.linearsearch;

public class WordSearch {

    public static String searchSentence(String[] sentences, String word){
        for(String sentence: sentences){
            for(String a: sentence.split(" ")){
                if(a.equals(word)){
                    return sentence;
                }
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "Java is a popular programming language",
                "Python is great for data science",
                "I love coding in Java",
                "Artificial Intelligence is fascinating"
        };

        String word = "Java";  // Word to search for

        String result = searchSentence(sentences, word);
        System.out.println("Result: " + result);
    }
}
