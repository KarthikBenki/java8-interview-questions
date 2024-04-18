package practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstTest {
    public static void main(String[] args) {
        String str = "I love my India";

        Character c = str.chars()
                .mapToObj(e -> Character.toLowerCase(Character.valueOf((char) e)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(c);
    }
}
