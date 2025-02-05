package org.example.challenge;

public class SearchTargetIndex {

    public static int searchIndex(int[] arr, int target){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 64, 0, -6, 4, 8};
        int target = 64;

        int position = SearchTargetIndex.searchIndex(arr, target);

        if(position == -1){
            System.out.println("Target element not found");
        }
        else{
            System.out.println("Target element position is: " + position);
        }
    }
}
