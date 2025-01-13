import java.util.Arrays;

public class Rotate_Array_kth_time{
    public static void rotateArray(int[] arr, int d) {
        d = d % arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotateArray(arr, 2);
        System.out.println(Arrays.toString(arr)); // Output: [3, 4, 5, 6, 7, 1, 2]
    }
}
