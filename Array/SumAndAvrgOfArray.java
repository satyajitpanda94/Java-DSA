import java.util.Arrays;

public class SumAndAvrgOfArray {
    public static int sum(int[] arr) {
        return Arrays.stream(arr)
                .sum();
    }

    public static double avrg(int[] arr) {
        return Arrays.stream(arr)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        int[] arr = { 57, 45, 32, 19, 74, -14 };

        System.out.println(sum(arr));
        System.out.println(avrg(arr));
    }
}
