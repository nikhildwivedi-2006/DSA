package Array;

public class Arr06PairProb {

    static void printPairs(int arr[]) {

        int tp = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                System.out.print("(" + arr[i] + " , " + arr[j] + ")");

                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs will be " + tp);

    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8 };

        printPairs(arr);

    }
}
