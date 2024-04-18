package practice;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Create a list of integers with duplicates
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5, 5);

        // Remove duplicates using stream and distinct()
        List<Integer> uniqueList = numbers.stream()
                .distinct()  // Keep only unique elements based on object identity
                .toList();    // Collect the unique elements into a new list

        System.out.println(uniqueList);

    }
}
