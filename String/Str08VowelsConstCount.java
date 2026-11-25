package String;

public class Str08VowelsConstCount {

    public static void main(String[] args) {

        String str = "Hello World";
        int constant = 0;
        int vowel = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            Character.toLowerCase(ch);

            if (ch == ' ')
                continue;

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else {
                constant++;
            }

        }
        System.out.println(vowel);
        System.out.println(constant);
    }

}