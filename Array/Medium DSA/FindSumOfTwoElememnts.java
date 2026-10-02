// Two Sum — find two elements whose sum equals a target.

import java.util.Arrays;

public class FindSumOfTwoElememnts {
    public static void main(String[] args) {
        int[] arr = { 2, 8, 14, 12, 6, 17 };

        System.out.println(Arrays.toString(findSumElements(arr, 16)));
    }

    private static int[] findSumElements(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }
}
