package Array;

public class Arr13LetRotateOptimal {

    static void reverse(int arr[], int start, int end) {

        while (start < end) {

            int temp = arr[start];

            arr[start] = arr[end];

            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void leftRotate(int arr[], int k) {

        int n = arr.length;

        k = k % n;

        if (k == 0)
            return;

        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);

        reverse(arr, 0, n - 1);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        leftRotate(arr, 2);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
