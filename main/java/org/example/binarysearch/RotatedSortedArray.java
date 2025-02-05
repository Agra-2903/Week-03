package org.example.binarysearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};

        int left = 0, right = arr.length-1;
        while(left < right){
            int mid = (left + right) / 2;

            if(arr[mid] > arr[right]){
                left = mid + 1;
            }
            else if(arr[mid] < arr[right]){
                right = mid;
            }
        }

        System.out.println(arr[left]);
    }
}
