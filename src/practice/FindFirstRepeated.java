package practice;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeated {

    public static void main(String[] args) {
        String input = "Java Articles are Awesome";

        Character c = input.chars().mapToObj(e -> Character.toLowerCase((Character.valueOf((char) e))))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(e -> e.getValue() > 1L)
                .map(e -> e.getKey())
                .findFirst()
                .get();

        System.out.println(c);
    }
}
