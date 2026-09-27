import java.util.*;
import java.util.stream.Collectors;

public class FindFrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = { 25, 78, 13, 48, 25, 64, 75, 25, 13, 78, 78, 23 };

        System.out.println(findFrequency(arr));
        System.out.println(findFrequencyByMap(arr));
    }

	private static Map<Integer,Integer> findFrequencyByMap(int[] arr) {
		Map<Integer, Integer> freq=new HashMap<>();

        for (int i : arr) {
            freq.put(i,freq.getOrDefault(i, 0)+1);
        }

        return freq;
	}

    private static Map<Integer, Long> findFrequency(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
    }
}
