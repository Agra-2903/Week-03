package org.example.stringbuffer;

public class StringPerformanceTest {

    public static long builderTime(){
        String str = "Hello";
        int iteration = 1000000;

        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < iteration; i++) {
            stringBuilder.append(str);
        }
        long endTimeBuilder = System.nanoTime();

        return endTimeBuilder - startTimeBuilder;
    }

    public static long bufferTime(){
        String str = "Hello";
        int iteration = 1000000;

        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < iteration; i++) {
            stringBuffer.append(str);
        }
        long endTimeBuffer = System.nanoTime();

        return endTimeBuffer - startTimeBuffer;
    }

    public static void main(String[] args) {
        System.out.println("StringBuilder performance time: " + StringPerformanceTest.builderTime());
        System.out.println("StringBuffer performance time: " + StringPerformanceTest.bufferTime());
    }
}
