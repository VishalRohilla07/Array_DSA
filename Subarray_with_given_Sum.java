public class Subarray_with_given_Sum {
    public static void findSubarrayWithSum(int[] arr, int target) {
        int currSum = 0, start = 0;

        for (int end = 0; end < arr.length; end++) {
            currSum += arr[end];
            while (currSum > target && start <= end) {
                currSum -= arr[start++];
            }
            if (currSum == target) {
                System.out.println("Subarray found between indexes " + start + " and " + end);
                return;
            }
        }
        System.out.println("No subarray found");
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        findSubarrayWithSum(arr, 33); // Output: Subarray found between indexes 2 and 4
    }
}

