import java.util.*;

public class SortEmployeeId {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            // Move elements that are greater than key to one position ahead
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIds = {534354, 534351,563435, 524563};
        insertionSort(employeeIds);
        System.out.println(Arrays.toString(employeeIds));
    }
}
