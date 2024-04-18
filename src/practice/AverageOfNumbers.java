package practice;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        double v = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println(v);

        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println(average);

        double asDouble = list.stream().mapToInt(e -> Integer.valueOf(e)).average().getAsDouble();

        System.out.println(asDouble);
    }
}
