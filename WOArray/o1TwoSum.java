package WOArray;

import java.util.Arrays;

public class o1TwoSum {

    static int[] twoSum(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {

        int arr[] = { 2, 7, 11, 15 };

        int result[] = twoSum(arr, 9);

        System.out.println(Arrays.toString(result));
    }
}
