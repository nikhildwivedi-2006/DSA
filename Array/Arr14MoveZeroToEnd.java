package Array;

public class Arr14MoveZeroToEnd {

    static void zeroEnd(int arr[]) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 0, 6, 3, 0, 1, 0, 5 };

        zeroEnd(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

}
