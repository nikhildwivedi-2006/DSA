package Array;

public class Arr15MoveZerEnd2 {

    static void zeroEnd(int arr[]) {

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 0, 4, 0, 5, 0, 6, 1, 0 };

        zeroEnd(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
