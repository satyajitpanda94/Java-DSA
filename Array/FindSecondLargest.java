import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargest {
    public static void main(String[] args) {
         int[] arr = { 45, 78, 10, 31, 65, 94, 48 };
        int largest1 = findSecondLargest(arr);
        System.out.println(largest1);
        int largest2 = findSecondLargestByStream(arr);
        System.out.println(largest2);
    }

	private static int findSecondLargestByStream(int[] arr) {
		return Arrays.stream(arr)
        // .boxed()
        // .mapToObj(value->Integer.valueOf(value))
        .mapToObj(Integer::valueOf)
        .sorted((a,b)->b-a)
        .skip(1)
        .findFirst()
        .orElse(0);
	}

	private static int findSecondLargest(int[] arr) {
		int largest=0;
        int secondLargest=0;

        for (int i : arr) {
            if(i>largest){
                secondLargest=largest;
                largest=i;
            }
        }

        return secondLargest;
	}
}
