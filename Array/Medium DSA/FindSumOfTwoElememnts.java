// Two Sum — find two elements whose sum equals a target.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class FindSumOfTwoElememnts {
    public static void main(String[] args) {
        int[] arr = { 2, 8, 14, 12, 6, 17, 10 };

        System.out.println(Arrays.toString(findSumElements(arr, 16)));
        System.out.println(Arrays.toString(findSumElementsByStream(arr, 16)));
        System.out.println(Arrays.toString(findSumElementsByHashMap(arr, 16)));
    }

    private static int[] findSumElementsByHashMap(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < arr.length; j++) {
            int other=target-arr[j];
            if (map.containsKey(other)) {
                return new int[] { map.get(other), j };
            }
            map.put(arr[j], j);
        }

        return new int[] { -1, -1 };
    }

    private static int[] findSumElementsByStream(int[] arr, int target) {
        return IntStream.range(0, arr.length)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, arr.length)
                        .filter(j -> arr[i] + arr[j] == target)
                        .mapToObj(j -> new int[] { i, j }))
                .findFirst()
                .orElse(new int[] { -1, -1 });
    }

    private static int[] findSumElements(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }
}
