import java.util.HashSet;

public class Array_DSA {
    public static void findPairWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return;
            }
            set.add(num);
        }
        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        findPairWithSum(new int[]{2, 7, 11, 15}, 9); // Output: Pair found: (7, 2)
    }
}
