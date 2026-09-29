public class LinearSearchForElement {
    public static void main(String[] args) {
        int[] arr = { 24, 78, 14, 15, 94 };

        System.err.println(searchElement(arr, 36));
    }

    private static int searchElement(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return i;
        }

        return -1;
    }
}
