import java.util.stream.IntStream;

public class LinearSearchForElement {
    public static void main(String[] args) {
        int[] arr = { 24, 78, 14, 15, 94, 15 };

        System.err.println(searchElement(arr, 36));
        System.err.println(searchElementByStream(arr, 15));
    }

    private static int searchElementByStream(int[] arr, int num) {
        return IntStream.range(0, arr.length)
                .filter(n -> arr[n] == num)
                .findFirst()
                .orElse(-1);
    }

    private static int searchElement(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return i;
        }

        return -1;
    }
}
