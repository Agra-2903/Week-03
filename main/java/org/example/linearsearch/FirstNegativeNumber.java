package org.example.linearsearch;

public class FirstNegativeNumber {

    public static int searchNumber(int[] arr){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                return i+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 64, 0, -6, 4, 8};

        int firstNegativePosition = FirstNegativeNumber.searchNumber(arr);
        if(firstNegativePosition == -1){
            System.out.println("No negative number exist");
        }
        else{
            System.out.println("Negative number position: " + firstNegativePosition);
        }
    }
}
