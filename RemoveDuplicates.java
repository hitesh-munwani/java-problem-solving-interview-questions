import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 3, 5};
        Arrays.sort(arr);
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[++j] = arr[i];
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr, j + 1)));
    }
}