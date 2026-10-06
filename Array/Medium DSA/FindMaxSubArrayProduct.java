
public class FindMaxSubArrayProduct {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4, 8, 0, 14 };

        System.out.println(findMaxProduct(arr));
        System.out.println(findMaxProduct2(arr));
        int[] arr1 = { -2, 3, -4 };

        System.out.println(findMaxProduct(arr1));
        System.out.println(findMaxProduct2(arr1));
        int[] arr2 = { -2, 0, -1, 5 };

        System.out.println(findMaxProduct(arr2));
        System.out.println(findMaxProduct2(arr2));

        int[] arr3={ 2, 3, -2, 0, 4, 8, -3, 2, -3, 10 };
        System.out.println(findMaxProduct(arr3));
        System.out.println(findMaxProduct2(arr3));
        int[] arr4={ -1,-2,-3,0 };
        System.out.println(findMaxProduct(arr4));
        System.out.println(findMaxProduct2(arr4));
        int[] arr5={ -1, 0, -2 };
        System.out.println(findMaxProduct(arr5));
        System.out.println(findMaxProduct2(arr5));
    }

    private static int findMaxProduct2(int[] arr) {
        int prefix = 1;
        int sufix = 1;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (prefix==0) {
                prefix=1;
            }
            if (sufix==0) {
                sufix=1;
            }

            prefix=prefix*arr[i];
            sufix=sufix*arr[arr.length-1-i];

            result=Math.max(result, Math.max(prefix, sufix));
        }
        return result;
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
