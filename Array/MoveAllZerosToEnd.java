import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = { 0, 24, 0, 84, 0, 34, 0, 89, 74, 12, 0, 47 };
        int[] arr2 = { 0, 24, 0, 84, 0, 34, 0, 89, 74, 12, 0, 47 };
        int[] arr3 = { 0, 24, 0, 84, 0, 34, 0, 89, 74, 12, 0, 47 };
        int[] arr4 = { 0, 24, 0, 84, 0, 34, 0, 89, 74, 12, 0, 47 };

        System.err.println(Arrays.toString(moveAllZerosToEnd(arr)));
        System.err.println(Arrays.toString(moveAllZerosToEnd2(arr2)));
        System.err.println(Arrays.toString(moveAllZerosToEnd3(arr3)));
        System.err.println(Arrays.toString(moveAllZerosToEndUsingExtraArray(arr4)));
    }

    private static int[] moveAllZerosToEndUsingExtraArray(int[] arr) {
        int[] res=new int[arr.length];

        return res;
    }

    private static int[] moveAllZerosToEnd3(int[] arr) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        return arr; // preserve the order of non-zero elements in general.
    }

    private static int[] moveAllZerosToEnd2(int[] arr) {
        int j = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                int temp = arr[j];
                arr[j--] = arr[i];
                arr[i] = temp;
            }
        }

        return arr; // doesn't preserve the order of non-zero elements in general.
    }

    private static int[] moveAllZerosToEnd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr; // preserve the order of non-zero elements in general.
    }
}
