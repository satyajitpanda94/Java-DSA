// Maximum Subarray Sum — Kadane's Algorithm
// Given an array, find the contiguous subarray having the maximum sum.


public class FindMaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println(findMaxSubarraySum(arr));
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
