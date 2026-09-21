import java.util.Arrays;

public class FindLargestElement{
    public static int findLargest(int[] arr){
        int largest=arr[0];

        for (int i : arr) {
            if(i>largest){
                largest=i;
            }
        }

        return  largest;
    }

    public static int findLargestByStream(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] arr={45,78,10,31,65,94,48};
        int largest1=findLargest(arr);
        int largest2=findLargestByStream(arr);
        System.out.println(largest1);
        System.out.println(largest2);
    }
}