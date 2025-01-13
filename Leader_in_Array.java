public class Leader_in_Array {
    public static void printLeaders(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        printLeaders(new int[]{16, 17, 4, 3, 5, 2}); // Output: 2 5 17 as to there right 
        //no element is greater than them.
    }
}
