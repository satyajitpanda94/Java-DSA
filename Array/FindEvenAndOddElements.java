import java.text.Collator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenAndOddElements {
    public static Map<String, Integer> findEvenAndOdd(int[] arr) {
        Map<String, Integer> evenAndOdd = new HashMap<>();
        int oddCount = 0;
        int evenCount = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        evenAndOdd.put("evenCount", evenCount);
        evenAndOdd.put("oddCount", oddCount);
        return evenAndOdd;
    }

    public static void main(String[] args) {
        int[] arr = { 24, 15, 7, 13, 71, 55, 20, 94, 36, 47 };

        System.out.println(findEvenAndOdd(arr));

        int[] arr2 = { 4, 15, 7, 13, 55, 20, 94, 36, 47 };

        System.out.println(findEvenAndOddByStream(arr2));
    }

    private static Map<String, Long> findEvenAndOddByStream(int[] arr) {
        return Arrays.stream(arr)
                // .boxed()
                .mapToObj(Integer::valueOf)
                .map(n -> n % 2 == 0 ? "even" : "odd")
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
    }
}
