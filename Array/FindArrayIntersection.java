import java.util.*;

public class FindArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 3, 4, 5, 6, 7 };

        System.out.println(Arrays.toString(findIntersection(arr1, arr2)));
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
