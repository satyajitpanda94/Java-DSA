import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 8, 9 };

        System.out.println(Arrays.toString(rotateTheArray(arr, 2)));
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
