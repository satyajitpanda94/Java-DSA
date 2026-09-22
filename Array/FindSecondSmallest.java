public class FindSecondSmallest {
    public static void main(String[] args) {
        int[] arr={24,10,78,23,1,94,-12,36};
        int secondSmallest=findSecondSmallest(arr);

        System.out.println(secondSmallest);
    }

	private static int findSecondSmallest(int[] arr) {
		int smallest=arr[0];
        int secondSmallest=smallest;

        for(int i : arr){
            if(i<smallest){
                secondSmallest=smallest;
                smallest=i;
            }
        }

        return secondSmallest;
	}
}
