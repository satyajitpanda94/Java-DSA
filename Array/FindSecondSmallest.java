import java.util.Arrays;

public class FindSecondSmallest {
    public static void main(String[] args) {
        int[] arr = { 24, 10, 78, 23, 1, 94, -12, 36 };
        int secondSmallest = findSecondSmallest(arr);

        System.out.println(secondSmallest);

        int secondSmallest2 = findSecondSmallestByStream(arr);

        System.out.println(secondSmallest2);
    }

    private static int findSecondSmallestByStream(int[] arr) {
        return Arrays.stream(arr)
                .sorted()
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(0);
    }

    private static int findSecondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = smallest;

        for (int i : arr) {
            if (i < smallest) {
                secondSmallest = smallest;
                smallest = i;
            }
        }

        return secondSmallest;
    }
}
