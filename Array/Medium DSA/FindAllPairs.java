// Find all pairs with a given sum.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllPairs {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,3,7,9,0};
        
        System.err.println(Arrays.deepToString(findPairs(arr, 10)));
    }

    private static int[][] findPairs(int[] arr, int sum) {
        int[][] res=new int[arr.length][];
        int k=0;

        for (int i = 0; i < res.length; i++) {
            for (int j = i+1; j < res.length; j++) {
                if(arr[i]+arr[j]==sum){
                    res[k++]=new int[]{arr[i],arr[j]};
                    break;
                }
            }
        }

        return Arrays.copyOf(res, k);
    }
}
