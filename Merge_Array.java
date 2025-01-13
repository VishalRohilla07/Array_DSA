import java.util.Arrays;

public class Merge_Array {
    public static void mergeArrays(int[] mPlusN, int[] N, int m) {
        int i = m - 1, j = N.length - 1, k = mPlusN.length - 1;

        while (i >= 0 && j >= 0) {
            if (mPlusN[i] > N[j]) {
                mPlusN[k--] = mPlusN[i--];
            } else {
                mPlusN[k--] = N[j--];
            }
        }
        while (j >= 0) {
            mPlusN[k--] = N[j--];
        }
    }

    public static void main(String[] args) {
        int[] mPlusN = {1, 5, 9, 0, 0, 0};
        int[] N = {2, 6, 8};
        mergeArrays(mPlusN, N, 3);
        System.out.println(Arrays.toString(mPlusN)); // Output: [1, 2, 5, 6, 8, 9]
    }
}
