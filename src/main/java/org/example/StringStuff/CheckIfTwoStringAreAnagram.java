package org.example.StringStuff;

import java.util.Arrays;

public class CheckIfTwoStringAreAnagram {
    public static void main(String[] args) {
        String word1 = "Hello";
        String word2 = "olelh";

        if (word1.length() == word2.length()){
            // put them in lowercase
            String str1 = word1.toLowerCase();
            String str2 = word2.toLowerCase();

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);

            if (result){
                System.out.println("It is Anagram");
            }else {
                System.out.println("Not an Anagram");
            }

        } else {
            System.out.println("Not an Anagram");
        }
    }
}
