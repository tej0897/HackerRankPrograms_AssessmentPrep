package org.example.StringStuff;

public class CheckTheLengthOfString {
    public static void main(String[] args) {
        String string = "Hello there, master!";
        int length = 0;
        char[] charArray = string.toCharArray();
        for (char c : charArray){
            length++;
        }
        System.out.println("Length of the string '"+string.toUpperCase()+ "' is : " +length);
    }
}
