package Array;

class Arr08LinearSearch {

    static int linearSearch(int arr[]) {

        int key = 8;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 9, 3, 5, 1, 11, };

        System.out.println(linearSearch(arr));
    }
}
