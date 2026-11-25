package String;

public class Str06Anagram {

    public static void main(String[] args) {

        String str1 = "silent";
        String str2 = "listen";

        if (str1.length() != str2.length()) {
            System.out.println("Not anagram");
            return;
        }

        int freq[] = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'a']--;
        }

        boolean isAnagram = true;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

    }
}
