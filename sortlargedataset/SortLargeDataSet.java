package org.example.sortlargedataset;

import java.util.Random;

public class SortLargeDataSet {

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int N = 1000; // Large dataset
        int[] arr = new int[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            arr[i] = random.nextInt(N * 10);
        }

        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        System.arraycopy(arr, 0, arr1, 0, N);
        System.arraycopy(arr, 0, arr2, 0, N);

        long startTime1 = System.nanoTime();
        SortLargeDataSet.bubbleSort(arr);
        long endTime1 = System.nanoTime();
        System.out.println("Time taken by bubble sort: " + (endTime1 - startTime1));

        long startTime2 = System.nanoTime();
        MergeSort.mergeSort(arr1, 0, arr1.length - 1);
        long endTime2 = System.nanoTime();
        System.out.println("Time taken by merge sort: " + (endTime2 - startTime2));

        long startTime3 = System.nanoTime();
        QuickSort.quickSort(arr2, 0, arr2.length - 1);
        long endTime3 = System.nanoTime();
        System.out.println("Time taken by quick sort: " + (endTime3 - startTime3));
    }
}
