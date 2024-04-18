package practice;

import java.util.Arrays;
import java.util.List;

public class NumberOfOccurrences {  // More descriptive class name
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 1, 3, 2, 5, 5, 6, 2);
        int target = 2;  // Using int for count is more common

        // Count occurrences using stream
        long count = list.stream()
                .filter(i -> i == target) // Filter elements equal to the target
                .count();                   // Count the number of elements in the filtered stream

        System.out.println("Number of occurrences of " + target + ": " + count);
    }
}
