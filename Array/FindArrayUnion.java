import java.util.*;
import java.util.stream.IntStream;

public class FindArrayUnion {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 5, 6, 7 };

        System.out.println(Arrays.toString(findUnionByStream(arr1, arr2)));
        System.out.println(Arrays.toString(findUnionByloop(arr1, arr2)));
        System.out.println(Arrays.toString(findUnionByloop2(arr1, arr2)));
    }

    private static int[] findUnionByloop2(int[] arr1, int[] arr2) {
		int[] union=new int[arr1.length+arr2.length];
        int k=0;

        for (int n : arr1) {
            boolean found=false;

            for (int i = 0; i < k; i++) {
                if(union[i]==n){
                    found=true;
                    break;
                }
            }

            if (!found) {
                union[k++]=n;
            }
        }

        for (int m : arr2) {
            boolean found=false;

            for (int j = 0; j < k; j++) {
                if(union[j]==m){
                    found=true;
                    break;
                }
            }

            if (!found) {
                union[k++]=m;
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
