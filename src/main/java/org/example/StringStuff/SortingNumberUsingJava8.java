package org.example.StringStuff;

import java.util.Arrays;
import java.util.List;

public class SortingNumberUsingJava8 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(12,31,-1,3,45,32,2);
        List<Integer> sortedList = myList.stream()
                .sorted()
                .toList();
        System.out.println(myList);
        System.out.println(sortedList);
    }
}
