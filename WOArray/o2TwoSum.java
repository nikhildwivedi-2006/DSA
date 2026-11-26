package WOArray;

import java.util.Arrays;
import java.util.HashMap;

public class o2TwoSum {

    static int[] twoSum(int arr[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int remaining = target - arr[i];

            if (map.containsKey(remaining)) {
                return new int[] { map.get(remaining), i };
            }

            map.put(arr[i], i);
        }

        return new int[] {};

    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 13 };

        int result[] = twoSum(arr, 9);

        System.out.println(Arrays.toString(result));

    }

}
