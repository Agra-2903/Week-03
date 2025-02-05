package org.example.challenge;

import java.util.Arrays;

public class FirstMissingPositive {

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

    public static void main(String[] args) {
        int[] arr = {4, -1, 2, 6, 9, 3, -4, 1, 5};

        System.out.println(FirstMissingPositive.findFirstMissing(arr));
    }
}
