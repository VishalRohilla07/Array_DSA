public class Majority_Element {
    public static int findMajorityElement(int[] arr) {
        int candidate = findCandidate(arr);
        return isMajority(arr, candidate) ? candidate : -1;
    }

    private static int findCandidate(int[] arr) {
        int count = 0, candidate = -1;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    private static boolean isMajority(int[] arr, int candidate) {
        int count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }
        return count > arr.length / 2;
    }

    public static void main(String[] args) {
        System.out.println(findMajorityElement(new int[]{2, 2, 1, 2, 2})); // Output: 2
    }
}
