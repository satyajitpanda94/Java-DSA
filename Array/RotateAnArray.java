import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 8, 9 };

        System.out.println(Arrays.toString(rotateTheArray(arr, 2)));
        System.out.println(Arrays.toString(rotateTheSameArray(arr, 2)));
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println(Arrays.toString(rotateTheSameArray2(arr, 2)));
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println(Arrays.toString(rotateArrayByStream(arr, 3)));
    }

    private static int[] rotateArrayByStream(int[] arr, int i) {
        return IntStream.concat(
                Arrays.stream(arr).skip(i),
                Arrays.stream(arr).limit(i))
                .toArray();

        // Also done by below
        
        // return IntStream.concat(
        //         Arrays.stream(arr, i, arr.length),
        //         Arrays.stream(arr, 0, i))
        //         .toArray();
    }

    private static int[] rotateTheSameArray2(int[] arr, int k) {
        int arrlen = arr.length;

        for (int i = 0; i < k; i++) {
            int first = arr[0];

            for (int j = 0; j < arrlen - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[arrlen - 1] = first;
        }

        return arr;
    }

    private static int[] rotateTheSameArray(int[] arr, int n) {
        int l = arr.length;
        reverseArr(arr, 0, n - 1);
        reverseArr(arr, n, l - 1);
        reverseArr(arr, 0, l - 1);
        return arr;
    }

    private static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    private static int[] rotateTheArray(int[] arr, int n) {
        int[] res = new int[arr.length];
        int k = 0;

        for (int i = n; i < arr.length; i++) {
            res[k++] = arr[i];
        }

        for (int j = 0; j < n; j++) {
            res[k++] = arr[j];
        }

        return res;
    }
}
