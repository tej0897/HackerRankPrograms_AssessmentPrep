package org.example.StringStuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ProblemOne {
    public static void main(String[] args) {
        List<String> operations = new ArrayList<String>();
        operations.add("push");
        operations.add("push");
        operations.add("push");
        operations.add("pop");

        List<Integer> x = Arrays.asList(1,2,3,1);

        // start
        List<Integer> elements = new ArrayList<Integer>();
        long min = 0, max = 0;
        List<Long> products = new ArrayList<>();

        for (int i = 0; i < operations.size(); i++) {
            for (int j = i; j < x.size(); j++) {
                elements.add(x.get(j));
                if (operations.get(i) == "pop") {
                    elements.remove(x.get(j));
                }
                if (i == 0) {
                    min = x.get(j);
                    max = x.get(j);
                } else {
                    long count = 0;
                    for (int ele : elements) {
                        if (count == 1) {
                            min = elements.get(ele);
                        }
                        max = elements.get(ele) > max ? elements.get(ele) : max;
                        min = elements.get(ele) < min ? elements.get(ele) : min;
                        count++;
                    }
                }
                products.set(min);
                products.add(max);
                System.out.println(products);
                break;
            }
        }
//        System.out.println(products);
    }
}
