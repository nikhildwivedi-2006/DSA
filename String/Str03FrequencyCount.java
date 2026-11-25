package String;

public class Str03FrequencyCount {

    public static void main(String[] args) {

        String str = "programming";

        int freq[] = new int[26];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            freq[ch - 'a']++;

        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.print((char) (i + 'a') + " = " + freq[i] + ", ");
            }
        }
    }
}
