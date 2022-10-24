package org.example.StringStuff;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class CheckIfStringHasAllUniqueChar {

    boolean uniqueChar(String string){
        return string.chars()
                .filter(e -> Collections.frequency(
                        string.chars().boxed().collect(Collectors.toList()), e) > 1)
                .count() <= 1;

    }

    public static void main(String[] args) {
        CheckIfStringHasAllUniqueChar object = new CheckIfStringHasAllUniqueChar();
        String input = "tejas";
        if (object.uniqueChar(input)){
            System.out.println("Yes, " +input.toUpperCase()+" has all unique characters");
        }else{
            System.out.println("No");
        }

    }
}
