package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 1, 9, 5, 2, 8, 6, 4);

        Integer secondLargest = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(secondLargest);
    }
}
