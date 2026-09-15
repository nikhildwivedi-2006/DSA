package Array;

public class Arr01LargestElem {

    public static void main(String[] args) {

        int arr[] = { 2, 4, 5, 3, 7, 9, 1, 8, 6 };

        int max = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > max) {
                max = num;
            }

        }
        System.out.println("Max is " + max);
    }

}