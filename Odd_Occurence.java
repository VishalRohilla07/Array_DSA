public class Odd_Occurence{
    public static int findOddOccurrence(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findOddOccurrence(new int[]{1, 2, 3, 2, 3, 1, 3})); // Output: 3
    }
}
