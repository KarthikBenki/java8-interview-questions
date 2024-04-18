package practice;

import java.util.Arrays;
import java.util.List;

public class StartsWithAString {
    public static void main(String[] args) {
        // Create a list of words
        List<String> words = Arrays.asList("Apple", "Banana", "Camel", "Angad");

        // Check if all words start with "A" (allMatch)
        boolean isMatch = words.stream()
                .allMatch(s -> s.startsWith("A"));  // Check if all elements start with "A"

        System.out.println("All words start with 'A': " + isMatch);

        // Check if any word starts with "A" (anyMatch)
        boolean anyMatch = words.stream()
                .anyMatch(s -> s.startsWith("A"));  // Check if at least one element starts with "A"

        System.out.println("Any word starts with 'A': " + anyMatch);
    }
}
