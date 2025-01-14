public class Find_Repeating_Elements {
    public static void findTwoRepeating(int[] arr) {
        int xor = 0, x = 0, y = 0;

        for (int num : arr) xor ^= num;
        for (int i = 1; i <= arr.length - 2; i++) xor ^= i;

        int rightmostSetBit = xor & -xor;

        for (int num : arr) {
            if ((num & rightmostSetBit) != 0) x ^= num;
            else y ^= num;
        }
        for (int i = 1; i <= arr.length - 2; i++) {
            if ((i & rightmostSetBit) != 0) x ^= i;
            else y ^= i;
        }

        System.out.println("Two repeating elements are: " + x + " and " + y);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        findTwoRepeating(arr); // Output: 4 and 2
    }
}
