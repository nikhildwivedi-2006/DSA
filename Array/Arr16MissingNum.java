package Array;

public class Arr16MissingNum {

    static int missingNumber(int arr[]) {

        int n = arr.length;

        int expectedSum = (n * (n + 1)) / 2;

        int sum = 0;
        for (int x : arr) {
            sum = sum + x;
        }
        // System.out.println(sum);

        int missNum = expectedSum - sum;

        return missNum;

    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 3, 4, 5 };

        System.out.print("missing number is : " + missingNumber(arr));

    }

}
