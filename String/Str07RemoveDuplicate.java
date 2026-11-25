package String;

import java.util.HashSet;

public class Str07RemoveDuplicate {

    public static void main(String[] args) {

        String str = "Programming";

        HashSet<Character> set = new HashSet<>();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);

            }
        }
        System.out.print(result);
    }
}
