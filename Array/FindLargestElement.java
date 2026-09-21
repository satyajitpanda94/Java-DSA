public class FindLargestElement{
    public static int findLargestElement(int[] arr){
        int largest=arr[0];

        for (int i : arr) {
            if(i>largest){
                largest=i;
            }
        }

        return  largest;
    }
    public static void main(String[] args) {
        int[] arr={45,78,10,31,65,94,48};
        int largest=findLargestElement(arr);
        System.out.println(largest);
    }
}