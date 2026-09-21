package Array;

public class Arr18NumberAppearOnce {

    public static void main(String[] args) {
        int arr[] = { 2, 4, 2, 8, 3, 1, 6, 3, 4, 5 };

        int xor = 0;

        for (int x : arr) {

            xor = xor ^ x;
        }
        System.out.println(xor);
    }
}
