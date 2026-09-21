package Array;

public class Arr17MaxOneConsecutive {

    static int onesCount(int arr[]) {

        int count = 0;
        int maxCount = 0;

        for (int x : arr) {
            if (x == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 2, 5, 1, 1, 1, 1, 6, 2, 1, 1, 1 };

        System.out.print(onesCount(arr));
    }
}
