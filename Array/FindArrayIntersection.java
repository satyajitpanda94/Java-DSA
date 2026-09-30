import java.util.*;
import java.util.stream.Collectors;

public class FindArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 3, 4, 5, 6, 7 };

        System.out.println(Arrays.toString(findIntersection(arr1, arr2)));
        System.out.println(Arrays.toString(findIntersection2(arr1, arr2)));
        System.out.println(Arrays.toString(findIntersectionByStream(arr1, arr2)));
    }

    private static int[] findIntersection2(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int n : arr1) {
            set1.add(n);
        }

        for (int n : arr2) {
            if (set1.contains(n)) {
                intersection.add(n);
            }
        }

        return intersection.stream()
                .mapToInt(Integer::valueOf)
                .toArray();
    }

    private static int[] findIntersectionByStream(int[] arr1, int[] arr2) {
        Set<Integer> set1 = Arrays.stream(arr1)
                .boxed()
                .collect(Collectors.toSet());

        return Arrays.stream(arr2)
                .filter(set1::contains)
                .distinct()
                .toArray();
    }

    private static int[] findIntersection(int[] arr1, int[] arr2) {
        int[] intersection = new int[arr1.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    intersection[k++] = arr1[i];
                }
            }
        }

        return Arrays.copyOf(intersection, k);
    }
}
