
public class FindMaxSubArrayProduct {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};

        System.out.println(findMaxProduct(arr));
    }

    private static int findMaxProduct(int[] arr) {
        int product=arr[0];
        int maxproduct=arr[0];

        for (int i = 1; i < arr.length; i++) {
            product*=arr[i];

            if(arr[i]>product){
                product=arr[i];
            }

            if(product>maxproduct){
                maxproduct=product;
            }
        }

        return maxproduct;
    }
}
