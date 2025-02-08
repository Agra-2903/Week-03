package org.example;

public class StringConcatenationPerformance {

    public static void stringPerform(){
        String s = "Hello";

        for(int i=1; i<1000; i++){
            s = s.concat(" Hello");
        }
    }

    public static void stringBuilderPerform(){
        StringBuilder sb = new StringBuilder("Hello");

        for(int i=1; i<1000; i++){
            sb.append(" Hello");
        }
    }

    public static void stringBufferPerform(){
        StringBuffer sb = new StringBuffer("Hello");

        for(int i=1; i<1000; i++){
            sb.append(" Hello");
        }
    }
    public static void main(String[] args) {
        long startTime1 = System.nanoTime();
        StringConcatenationPerformance.stringPerform();
        long endTime1 = System.nanoTime();
        System.out.println("Time taken by string to concat in a string: " + (endTime1 - startTime1));

        long startTime2 = System.nanoTime();
        StringConcatenationPerformance.stringBuilderPerform();
        long endTime2 = System.nanoTime();
        System.out.println("Time taken by string builder to concat in a string: " + (endTime2 - startTime2));

        long startTime3 = System.nanoTime();
        StringConcatenationPerformance.stringBufferPerform();
        long endTime3 = System.nanoTime();
        System.out.println("Time taken by string buffer to concat in a string: " + (endTime3 - startTime3));
    }
}
