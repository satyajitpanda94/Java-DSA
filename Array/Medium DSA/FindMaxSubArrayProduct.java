
public class FindMaxSubArrayProduct {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };

        System.out.println(findMaxProduct(arr));
        int[] arr1 = { -2, 3, -4 };

        System.out.println(findMaxProduct(arr1));
        int[] arr2 = {-2, 0, -1};

        System.out.println(findMaxProduct(arr2));
    }

    private static int findMaxProduct(int[] arr) {
        int maxproduct = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int product = 1;

            for (int j = i; j < arr.length; j++) {
                product *= arr[j];

                if (product > maxproduct) {
                    maxproduct = product;
                }
            }

        }

        return maxproduct;
    }
}
