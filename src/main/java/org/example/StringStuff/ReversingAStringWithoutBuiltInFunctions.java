package org.example.StringStuff;

import java.util.Scanner;

public class ReversingAStringWithoutBuiltInFunctions {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        string = scanner.nextLine();
        System.out.println("Reversed String is: ");
        StringBuilder reversedString = new StringBuilder();
        for (int i = string.length(); i > 0; i--) reversedString.append(string.charAt(i - 1));
        System.out.println(reversedString);

    }
}
