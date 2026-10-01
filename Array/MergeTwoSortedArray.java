import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 7, 9 };
        int[] arr2 = { 2, 5, 6, 8 };

        System.err.println(Arrays.toString(mergeArrays(arr1, arr2)));
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i];
                i++;
            } else if (arr1[i] > arr2[j]) {
                merged[k++] = arr2[j];
                j++;
            } else {
                merged[k++] = arr1[i];
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i];
            i++;
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j];
            j++;
        }

        return merged;
    }
}
