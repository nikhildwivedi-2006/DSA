package WOArray;

import java.util.HashSet;

public class o4ContainsDuplicate {

    static boolean containsDuplicate(int arr[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }

            set.add(arr[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 2, 7, 9 };

        System.out.println(containsDuplicate(arr));
    }

}
