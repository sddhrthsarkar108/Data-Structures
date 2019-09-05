package adt.strings;

public class findAnagrams {
    public static void main(String[] args) {
        if(isAnagram("listen", "silent")) {
            System.out.println("anagram");
        }

        if(!isAnagram("listen", "silene")) {
            System.out.println("not anagram");
        }
    }

    static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        int val = 0;
        int i = 0;

        for(int c: s1.toCharArray()) {
            val = val ^ c;
            val = val ^ s2.charAt(i);
            ++i;
        }

        return val == 0;
    }
}
