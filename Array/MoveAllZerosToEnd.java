import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr={24,0,84,34,0,89,74,12,0,47};

        System.err.println(Arrays.toString(moveAllZerosToEnd(arr)));
    }

	private static int[] moveAllZerosToEnd(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==0){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        return arr;
	}
}
