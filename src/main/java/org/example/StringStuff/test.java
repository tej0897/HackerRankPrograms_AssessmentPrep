package org.example.StringStuff;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(12);
        System.out.println(list);
        int [] listArray = new int[list.size()];
        list.toArray(new Integer[0]);
        System.out.println(listArray);
    }
}
