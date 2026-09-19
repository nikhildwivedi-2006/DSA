package Array;

public class Arr10RemoveDuplicateSortedArr {

    static int removeDuplicate(int arr[]) {

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {

                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 4, 5, 5, 6, 7, 7, };

        System.out.println(removeDuplicate(arr));

    }
}
