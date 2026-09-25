public class FindMissingNumber {
    public static void main(String[] args) {
        int[] input = { 2, 3, 4, 5, 6 };
        System.out.println(findMissingNumber(input, 6));
    }

    private static int findMissingNumber(int[] input, int n) {
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] != n) {
                return n;
            }
            n--;
        }

        return n;
    }
}
