package org.example;

import java.util.Arrays;

public class ChallengeProblem {

    public static int findFirstMissing(int[] arr){

        Arrays.sort(arr);
        int[] positiveNumbers = new int[arr[arr.length - 1] -1];

        int num = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                if(arr[i] == num){
                    num++;
                }
                else if(arr[i] > num){
                    return num;
                }
            }
        }

        return num;
    }

    public static int searchIndex(int[] arr, int target){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, -1, 2, 6, 9, 3, -4, 1, };
        int target = -4;

        System.out.println("First Missing Positive Number is: " + ChallengeProblem.findFirstMissing(arr));

        int position = ChallengeProblem.searchIndex(arr, target);

        if(position == -1){
            System.out.println("Target element not found");
        }
        else{
            System.out.println("Target element position is: " + position);
        }
    }
}
