package org.example.binarysearch;

public class PeakElement {

    public static int searchPeak(int[] arr){
        int left = 0, right = arr.length - 1;
        int peak = 0;

        while (left < right){
            int mid = (left + right) / 2;
            if((arr[mid] > arr[mid - 1]) && (arr[mid] > arr[mid + 1])){
                peak = arr[mid];
                break;
            }

            if(arr[mid] < arr[mid - 1]){
                right = mid - 1;
            }
            else if(arr[mid] < arr[mid + 1]){
                left = mid + 1;
            }
        }

        return peak;
    }

    public static boolean isPeak(int[] arr){
        int left = 0, right = arr.length - 1;

        while (left < right){
            int mid = (left + right) / 2;
            if((arr[mid] > arr[mid - 1]) && (arr[mid] > arr[mid + 1])){
                return true;
            }

            if(arr[mid] < arr[mid - 1]){
                right = mid - 1;
            }
            else if(arr[mid] < arr[mid + 1]){
                left = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 2, 23, 90, 68};

        if(PeakElement.isPeak(arr)){
            System.out.println(PeakElement.searchPeak(arr));
        }
        else{
            System.out.println("No peak element exist");
        }
    }
}
