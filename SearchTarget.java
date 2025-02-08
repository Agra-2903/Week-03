package org.example;

import java.util.Arrays;
import java.util.Random;

public class SearchTarget {

    public static void linearSearch(int[] arr, int target){

        for(int i: arr){
            if(i == target){
                return;
            }
        }
    }

    public static void binarySearch(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == target){
                return;
            }
            else if(arr[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        int N = 1000; // Large dataset
        int[] arr = new int[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            arr[i] = random.nextInt(N * 10);
        }

        int target = arr[N / 2];

        Arrays.sort(arr);

        long startTime = System.nanoTime();
        SearchTarget.linearSearch(arr, target);
        long endTime = System.nanoTime();
        System.out.println("Time taken by linear search: " + (endTime - startTime));

        long startTime1 = System.nanoTime();
        SearchTarget.binarySearch(arr, target);
        long endTime1 = System.nanoTime();
        System.out.println("Time taken by binary search: " + (endTime1 - startTime1));
    }
}
