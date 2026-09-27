import java.util.Arrays;
import java.util.HashMap;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr = { 24, 12, 67, 23, 24, 58, 12, 94, 64, 67 };
        System.out.println(Arrays.toString(findDuplicates(arr)));
    }

    private static int[] findDuplicates(int[] arr) {
        int res[]=new int[arr.length];
        int k=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j] && i!=j){
                    res[k++]=arr[i];
                }
            }
        }
        return Arrays.copyOf(res, k);
    }
}
