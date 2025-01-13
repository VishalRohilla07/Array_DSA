import java.util.Arrays;

public class Segregate_zeros_ones{
    public static void segregateZerosAndOnes(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
            if (arr[left] == 0) left++;
            if (arr[right] == 1) right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1};
        segregateZerosAndOnes(arr);
        System.out.println(Arrays.toString(arr)); // Output: [0, 0, 0, 1, 1, 1]
    }
}
