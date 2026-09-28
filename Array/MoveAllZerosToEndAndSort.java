import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveAllZerosToEndAndSort {
    public static void main(String[] args) {
        int arr[] = { 24, 0, 75, 18, 23, 47, 0, 94 };

        System.out.println(Arrays.toString(sortAndMoveAllZerosToEndByStream(arr)));
    }

    private static int[] sortAndMoveAllZerosToEndByStream(int[] arr) {
        return IntStream.concat(
                Arrays.stream(arr).filter(n -> n != 0).sorted(),
                Arrays.stream(arr).filter(n -> n == 0)).toArray();
    }
}
