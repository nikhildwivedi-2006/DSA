package Array;

public class Arr12LeftRotateByK {

    static void leftRotate(int arr[], int k) {

        for (int r = 0; r < k; r++) {

            int first = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {

                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = first;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        leftRotate(arr, 2);

        for (int x : arr) {
            System.out.println(x + " ");
        }
    }
}
