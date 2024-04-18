package practice;

import java.util.Arrays;
import java.util.List;

public class FindFirstEvenOdd {  // More descriptive class name

    public static void main(String[] args) {
        // Create a list of integers using Arrays.asList
        List<Integer> list = Arrays.asList(1, 3, 1, 5, 7, 12, 30);

        // Find and print the first even number
        Integer firstEvenNumber = list.stream()
                .filter(i -> i % 2 == 0)  // Filter for even numbers (divisible by 2)
                .findFirst()              // Get the first even number (if available)
                .orElse(0);               // Return 0 if no even number is found

        System.out.println("First even number: " + firstEvenNumber);

        // Find and print the first odd number
        Integer firstOdd = list.stream()
                .filter(integer -> integer % 2 != 0)  // Filter for odd numbers (not divisible by 2)
                .findFirst()              // Get the first odd number (if available)
                .orElse(0);               // Return 0 if no odd number is found

        System.out.println("First odd number: " + firstOdd);
    }
}
