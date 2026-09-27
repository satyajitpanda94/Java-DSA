import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] input = { 2, 3, 4, 5, 6 };
        System.out.println(findMissingNumber(input, 6));

        int[] input2 = { 1, 2, 3, 4, 6, 7 };
        System.out.println(findMissingNumberByStream(input2, 7));
    }

    private static int findMissingNumberByStream(int[] input, int n) {
        int sumOfInput = Arrays.stream(input)
                .sum();

        int sum = (n * (n + 1)) / 2;

        return sum - sumOfInput;
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
