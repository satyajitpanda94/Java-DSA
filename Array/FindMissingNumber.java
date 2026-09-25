public class FindMissingNumber {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5 };
        System.out.println(findMissingNumber(input, 6));
    }

    private static int findMissingNumber(int[] input, int n) {
        int j = 1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != j) {
                return j;
            }
            j++;
        }

        return j;
    }
}
