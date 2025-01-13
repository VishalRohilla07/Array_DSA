import java.util.Arrays;

public class Product_arrays {
    public static int[] productArray(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] product = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < n; i++) {
            product[i] = left[i] * right[i];
        }
        return product;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        // arr[0] = 2*3*4 =24
        // arr[1] = 1*3*4 =12
        // arr[2] = 1*2*4 = 8
        // arr[3] = 1*2*3 = 6
        System.out.println(Arrays.toString(productArray(arr))); // Output: [24, 12, 8, 6]
    }
}

