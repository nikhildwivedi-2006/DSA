package Array;

public class Arr03ReverseArr {

    static int[] reverse(int arr[]) {

        int start = 0;

        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];

            arr[start] = arr[end];

            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 10 };

        int[] reversed = reverse(arr);

        for (int x : reversed) {
            System.out.print(x + " ");
        }

    }
}
