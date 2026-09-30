import java.util.Arrays;
import java.util.stream.IntStream;

public class FindArrayUnion {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 5, 6, 7 };

        System.out.println(Arrays.toString(findUnionByStream(arr1, arr2)));
    }

    private static int[] findUnionByStream(int[] arr1, int[] arr2) {
        return IntStream.concat(
                Arrays.stream(arr1),
                Arrays.stream(arr2)).distinct()
                .toArray();
    }
}
