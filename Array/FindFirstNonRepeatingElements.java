import java.util.*;
import java.util.stream.*;

public class FindFirstNonRepeatingElements {
    public static void main(String[] args) {
        int[] arr = { 15, 74, 15, 23, 47, 59, 34 };

        System.err.println(findNonRepeating(arr));
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
