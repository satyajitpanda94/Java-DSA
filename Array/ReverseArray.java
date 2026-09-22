import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={41,75,23,65,20,14,37};
        int[] arr2={41,75,23,65,20,14,37,17};

        System.out.println("arr : "+Arrays.toString(arr));
        System.out.println("rev : "+Arrays.toString(reversedArray(arr)));

        System.out.println("arr : "+Arrays.toString(arr2));
        System.out.println("rev : "+Arrays.toString(reversedArray(arr2)));
    }

	private static int[] reversedArray(int[] arr) {
        int arrlength=arr.length;
		for (int index = 0; index < arrlength/2; index++) {
            int temp=arr[index];
            arr[index]=arr[arrlength-1-index];
            arr[arrlength-1-index]=temp;
        }

        return arr;
	}
}
