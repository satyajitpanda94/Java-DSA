import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr = { 24, 12, 67, 23, 24, 58, 12, 94, 64, 67 };
        System.out.println(Arrays.toString(findDuplicates(arr)));
        System.out.println(Arrays.toString(findDuplicatesUsingMap(arr)));
    }

    private static int[] findDuplicatesUsingMap(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        int[] res = new int[arr.length];
        int j = 0;

        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                res[j++] = entry.getKey();
            }
        }

        // for (int key : freq.keySet()) {
        // if (freq.get(key) > 1) {
        // res[j++] = key;
        // }
        // }

        return Arrays.copyOf(res, j);
    }

    private static int[] findDuplicates(int[] arr) {
        int res[] = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    res[k++] = arr[i];
                }
            }
        }
        return Arrays.copyOf(res, k);
    }
}
