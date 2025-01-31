import java.util.Arrays;

public class SortStudentAges {
    public static int[] countingSort(int[] arr){
        int n = arr.length;
        int[] outputArr = new int[n];
        int max_age = 0;
        for(int i=0; i<n; i++){
            if(max_age < arr[i]){
                max_age = arr[i];
            }
        }

        int[] countArr = new int[max_age + 1];
        for(int i=0; i<n; i++){
            countArr[arr[i]]++;
        }

        for(int i=1; i<=max_age; i++){
            countArr[i] += countArr[i-1];
        }

//        int j=0;
        for(int i=n-1; i>=0; i--){
            countArr[arr[i]]--;
            outputArr[countArr[arr[i]]] = arr[i];
        }

        return outputArr;
    }

    public static void main(String[] args) {
        int[] ages = {15, 19, 13, 12, 16, 14};
        int[] newArr = countingSort(ages);
        System.out.println(Arrays.toString(newArr));
    }
}
