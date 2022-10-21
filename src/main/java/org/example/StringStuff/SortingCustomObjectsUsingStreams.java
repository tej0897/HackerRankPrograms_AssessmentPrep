package org.example.StringStuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingCustomObjectsUsingStreams {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(Arrays.asList(
                new User("Tejas", 25),
                new User("Harini", 15),
                new User("Veena", 40),
                new User("Senthil", 50)
        ));

        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User :: getName).reversed())
                .collect(Collectors.toList());

        System.out.println(users);
        System.out.println(sortedUsers);

    }
}
