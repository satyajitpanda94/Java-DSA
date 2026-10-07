import java.util.*;

public class FindSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        System.out.println(Arrays.toString(findSubarray(arr, 12)));
    }

    private static int[] findSubarray(int[] arr, int targetsum) {
       int start=0;
       int end=0;

       outerloop:
       for (int i = 0; i < arr.length; i++) {
        int sum=0;
        for (int j = i; j < arr.length; j++) {
            sum+=arr[j];

            if(sum==targetsum){
                start=i;
                end=j;
                break outerloop;
            }
        }
       }

       int[] res=new int[end-start+1];
       for (int i = 0; i < res.length; i++) {
        res[i]=arr[start++];
       }

       return res;
    }
}
