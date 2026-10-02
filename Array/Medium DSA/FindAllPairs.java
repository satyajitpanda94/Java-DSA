// Find all pairs with a given sum.

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAllPairs {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 3, 7, 9, 0 };

        System.out.println(Arrays.deepToString(findPairs(arr, 10)));
        findPairsByStream(arr, 10).stream()
                .forEach(v -> System.out.println(Arrays.toString(v)));
    }

    private static List<int[]> findPairsByStream(int[] arr, int sum) {
        return IntStream.range(0, arr.length)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, arr.length)
                        .filter(j -> arr[i] + arr[j] == sum)
                        .mapToObj(j -> new int[] { arr[i], arr[j] }))
                .collect(Collectors.toList());
    }

    private static int[][] findPairs(int[] arr, int sum) {
        int[][] res = new int[arr.length][];
        int k = 0;

        for (int i = 0; i < res.length; i++) {
            for (int j = i + 1; j < res.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    res[k++] = new int[] { arr[i], arr[j] };
                    break;
                }
            }
        }

        return Arrays.copyOf(res, k);
    }
}
