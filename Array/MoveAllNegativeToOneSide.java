import java.util.*;
import java.util.stream.IntStream;

public class MoveAllNegativeToOneSide {
    public static void main(String[] args) {
        int[] arr = { 24, -47, 25, 14, -54, 36, 94, -12, 89, -35 };

        System.err.println(Arrays.toString(moveAllNegativeToLeft(Arrays.copyOf(arr, arr.length))));
        System.err.println(Arrays.toString(moveAllNegativeToLeft2(Arrays.copyOf(arr, arr.length))));
        System.err.println(Arrays.toString(moveAllNegativeToLeftByStream(Arrays.copyOf(arr, arr.length))));
        System.err.println(Arrays.toString(moveAllNegativeToLeftByStream2(Arrays.copyOf(arr, arr.length))));
    }

    private static int[] moveAllNegativeToLeftByStream2(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparing(n -> n < 0 ? 0 : 1))
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static int[] moveAllNegativeToLeftByStream(int[] arr) {
        return IntStream.concat(
                Arrays.stream(arr).filter(n -> n < 0),
                Arrays.stream(arr).filter(n -> n >= 0)).toArray();
    }

    private static int[] moveAllNegativeToLeft2(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }

        return arr;
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

        return arr; // preserves order
    }
}
