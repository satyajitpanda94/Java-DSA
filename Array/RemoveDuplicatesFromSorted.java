import java.util.Arrays;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] sortedArr = { 12, 25, 25, 36, 48, 48, 48, 57, 57, 91 };

        System.out.println(Arrays.toString(removeDuplicates(sortedArr)));

        int[] sortedArr2 = { 13, 13, 24, 33, 36, 48, 48, 49, 57, 91 };

        System.out.println(Arrays.toString(removeDuplicatesByStream(sortedArr2)));
    }

    private static int[] removeDuplicatesByStream(int[] sortedArr) {
        return Arrays.stream(sortedArr)
                .distinct()
                .toArray();
    }

    private static int[] removeDuplicates(int[] sortedArr) {
        int[] res = new int[sortedArr.length];

        int temp = sortedArr[0];
        int j = 0;
        res[j] = temp;
        for (int i = 1; i < sortedArr.length; i++) {
            if (sortedArr[i] != temp) {
                temp = sortedArr[i];
                res[++j] = temp;
            }
        }
        return Arrays.copyOf(res, j + 1);
    }
}
