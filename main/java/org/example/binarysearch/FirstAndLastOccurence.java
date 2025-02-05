package org.example.binarysearch;

public class FirstAndLastOccurence {

    public static int searchFirstOccurence(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        int firstOccurence = -1;
        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == target){
                firstOccurence = mid;
                right = mid - 1;
            }
            else if(arr[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

        return firstOccurence + 1;
    }

    public static int searchLastOccurence(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        int lastOccurence = -1;
        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == target){
                lastOccurence = mid;
                left = mid + 1;
            }
            else if(arr[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

        return lastOccurence + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 6, 8, 8};
        int target = 3;

        int firstOccurence = searchFirstOccurence(arr, target);
        int lastOccurence = searchLastOccurence(arr, target);

        if(firstOccurence == 0){
            System.out.println("Target value not present in the array");
        }
        else{
            System.out.println("Target value first occured at position " + firstOccurence);
            System.out.println("Target value last occured at position " + lastOccurence);
        }
    }
}
