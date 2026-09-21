public class FindSecondLargest {
    public static void main(String[] args) {
         int[] arr = { 45, 78, 10, 31, 65, 94, 48 };
        int largest1 = findSecondLargest(arr);
        System.out.println(largest1);
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
