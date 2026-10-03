// Maximum Subarray Sum — Kadane's Algorithm
// Given an array, find the contiguous subarray having the maximum sum.

import java.util.Arrays;

public class FindMaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println(findMaxSubarraySum(arr));
        System.out.println(Arrays.toString(findSubarrayWithMaxSum(arr)));
    }

    private static int[] findSubarrayWithMaxSum(int[] arr) {
        int sum = arr[0];
        int maxSum = sum;

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i] + sum) {
                sum = arr[i];
                tempStart = i;
            } else {
                sum += arr[i];
            }

            if (sum > maxSum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }
        }

        int[] res = new int[end - start + 1];
        int k = 0;

        for (int j = start; j <= end; j++) {
            res[k++] = arr[j];
        }

        return res;
    }

    private static int findMaxSubarraySum(int[] arr) {
        int sum = arr[0];
        int maxSum = arr[0];

        for (int k = 1; k < arr.length; k++) {
            sum += arr[k];

            if (arr[k] > sum) {
                sum = arr[k];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}
