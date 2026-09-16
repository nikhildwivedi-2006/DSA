package Array;

public class Arr05EquillibriumPoint {

    static int isEquillibrium(int arr[]) {

        int totalSum = 0;

        for (int x : arr) {
            totalSum += x;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {

            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 2, 2 };

        System.out.println(isEquillibrium(arr));
    }
}
