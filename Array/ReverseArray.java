import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 41, 75, 23, 65, 20, 14, 37 };
        int[] arr2 = { 41, 75, 23, 65, 20, 14, 37, 17 };

        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("rev : " + Arrays.toString(reversedArray(arr)));

        System.out.println("arr : " + Arrays.toString(arr2));
        System.out.println("rev : " + Arrays.toString(reversedArray(arr2)));

        int[] arr3 = { 41, 75, 23, 65, 20, 14, 37, 17, 84 };

        System.out.println("arr : " + Arrays.toString(arr3));
        System.out.println("rev : " + Arrays.toString(reversedArrayByStream(arr3)));
    }

    private static int[] reversedArrayByStream(int[] arr) {
        return IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i])
                .toArray();
    }

    private static int[] reversedArray(int[] arr) {
        int arrlength = arr.length;
        for (int index = 0; index < arrlength / 2; index++) {
            int temp = arr[index];
            arr[index] = arr[arrlength - 1 - index];
            arr[arrlength - 1 - index] = temp;
        }

        return arr;
    }
}
