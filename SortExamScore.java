import java.util.Arrays;

public class SortExamScore {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min_score = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min_score]){
                    min_score = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_score];
            arr[min_score] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {54, 68, 57, 95, 73, 69, 42};
        selectionSort(scores);
        System.out.println(Arrays.toString(scores));
    }
}
