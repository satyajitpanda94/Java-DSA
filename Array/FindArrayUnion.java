import java.util.*;
import java.util.stream.IntStream;

public class FindArrayUnion {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 5, 6, 7 };

        System.out.println(Arrays.toString(findUnionByStream(arr1, arr2)));
        System.out.println(Arrays.toString(findUnionByloop(arr1, arr2)));
        System.out.println(Arrays.toString(findUnionByloop2(arr1, arr2)));
        System.out.println(Arrays.toString(findUnionByloopForSortedArray(arr1, arr2)));
    }

    private static int[] findUnionByloopForSortedArray(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                addToUnion(union, arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                addToUnion(union, arr2[j]);
                j++;
            } else {
                addToUnion(union, arr1[i]);
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            addToUnion(union, arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            addToUnion(union, arr2[j]);
            j++;
        }

        return union.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static void addToUnion(List<Integer> union, int val) {
        // as using sorted array we need to check last value should not same as value
        // and add it to list.
        // so that we dont have duplicates in the list.

        int lastIndex = union.size() - 1;

        if (union.isEmpty() || union.get(lastIndex) != val) {
            union.add(val);
        }
    }

    private static int[] findUnionByloop2(int[] arr1, int[] arr2) {
        int[] union = new int[arr1.length + arr2.length];
        int k = 0;

        for (int n : arr1) {
            boolean found = false;

            for (int i = 0; i < k; i++) {
                if (union[i] == n) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                union[k++] = n;
            }
        }

        for (int m : arr2) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (union[j] == m) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                union[k++] = m;
            }
        }

        return Arrays.copyOf(union, k);
    }

    private static int[] findUnionByloop(int[] arr1, int[] arr2) {
        Set<Integer> union = new HashSet<>();

        for (int n : arr1) {
            union.add(n);
        }

        for (int n : arr2) {
            union.add(n);
        }

        return union.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static int[] findUnionByStream(int[] arr1, int[] arr2) {
        return IntStream.concat(
                Arrays.stream(arr1),
                Arrays.stream(arr2))
                .distinct()
                .toArray();
    }
}
