import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[]={14,78,25,49,36,57,24,12};

        System.out.println(Arrays.toString(sortedArray(arr)));
    }

    public static int[] sortedArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
}
