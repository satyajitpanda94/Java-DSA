import java.util.*;
import java.util.stream.Collectors;

public class FindFrequencyOfElements {
    public static void main(String[] args) {
        int[] arr={25,78,13,48,25,64,75,25,13,78,78,23};

        System.err.println(findFrequency(arr));
    }

    private static Map<Integer, Long> findFrequency(int[] arr) {
        return Arrays.stream(arr)
        .boxed()
        .collect(Collectors.groupingBy(n->n, Collectors.counting()));
    }
}
