package org.example.StringStuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemTwo {
    static long printMinOp(List<Integer> list)
    {

        int [] arr = list.stream().mapToInt(Integer::intValue).toArray();

        int arr_size = arr.length;
        int arraySum = 0;
        int smallest = arr[0];


        for (int i = 0; i < arr_size; i++) {
            // If current element is smaller than update smallest
            if (arr[i] < smallest)
                smallest = arr[i];

            // find array sum
            arraySum += arr[i];
        }

        long minOperation = arraySum - arr_size * smallest;

        // Print min operation required
        return minOperation;
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        List<Integer> arr = Arrays.asList(3, 4, 6, 6, 3);
        System.out.println(printMinOp(arr));
    }
}
