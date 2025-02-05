package org.example.binarysearch;

public class SearchMatrixForElement {

    public static boolean searchTarget(int[][] matrix, int target){
        int rows = matrix.length;
        int columns = matrix[0].length;

        int left = 0;
        int right = rows * columns - 1;

        while (left <= right){
            int mid = (left + right) / 2;

            int row = mid / columns;
            int column = mid % columns;

            if(matrix[row][column] == target){
                return true;
            }
            else if(matrix[row][column] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        int target = 1;

        if(SearchMatrixForElement.searchTarget(matrix, target)){
            System.out.println("Target element found");
        }
        else{
            System.out.println("Target element not found");
        }
    }
}
