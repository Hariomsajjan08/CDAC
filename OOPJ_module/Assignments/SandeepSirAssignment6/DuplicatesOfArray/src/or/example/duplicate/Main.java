package or.example.duplicate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 5, 4, 3, 2, 5, 7, 8, 9};
        int n = arr.length;

        Arrays.sort(arr);

        int j = 0; 
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];

        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
