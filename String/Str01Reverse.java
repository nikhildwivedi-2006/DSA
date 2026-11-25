
package String;

public class Str01Reverse {

    public static void main(String[] args) {

        String str = "Nikhil";

        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i));
        }
    }

}