public class FindMissingNumber {
    public static void main(String[] args) {
        int[] input={1,2,3,5,6};
        System.out.println(findMissingNumber(input, 6));
    }

    private static int findMissingNumber(int[] input, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if(input[i] != ++j){
                return j;
            }
        }

        return j;
    }
}
