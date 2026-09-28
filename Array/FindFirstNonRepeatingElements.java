import java.util.*;
import java.util.stream.*;

public class FindFirstNonRepeatingElements {
    public static void main(String[] args) {
        int[] arr = { 15, 74, 15, 23, 47, 59, 34 };

        System.err.println(findNonRepeating(arr));
        System.err.println(findNonRepeatingByHashMap(arr));
    }

    private static int findNonRepeatingByHashMap(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : arr) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        for (int i : arr) {
            if (freq.get(i) == 1) {
                return i;
            }
        }

        return 0;
    }

    private static int findNonRepeating(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() == 1)
                .mapToInt(n -> n.getKey())
                .findFirst()
                .orElse(0);
    }
}
