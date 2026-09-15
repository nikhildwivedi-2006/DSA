package Array;

public class Arr02SecLargELe {

    static int secLargest(int arr[]) {

        int largest = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

                secLar = largest;

                largest = arr[i];
            }

            if (arr[i] < largest && arr[i] > secLar) {
                secLar = arr[i];
            }

        }

        return secLar;
    }

    public static void main(String[] args) {

        int arr[] = { 4, 6, 1, 3, 7, 9, 12, 2, 4 };

        System.out.println(secLargest(arr));
    }
}
