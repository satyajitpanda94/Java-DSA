import java.util.*;

public class MoveAllNegativeToOneSide {
    public static void main(String[] args) {
        int[] arr = { 24, -47, 25, 14, -54, 36, 94, -12, 89, -35 };

        System.err.println(Arrays.toString(moveAllNegativeToLeft(arr)));
    }

    private static int[] moveAllNegativeToLeft(int[] arr) {
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int j = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }

        for (int k = 0; k < arr2.length; k++) {
            if (arr2[k] >= 0) {
                arr[j++] = arr2[k];
            }
        }

        return arr;
    }
}
