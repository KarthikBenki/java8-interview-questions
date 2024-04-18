package practice;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {

    public static void main(String[] args) {
        String input = "Java articles are Awesome";

        LinkedHashMap<Character, Long> collect = input.chars()
                .mapToObj(e -> Character.toLowerCase(Character.valueOf((char) e)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect);

        Map.Entry<Character, Long> characterLongEntry = collect.entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst().get();

        Character key = characterLongEntry.getKey();

        System.out.println(key);


        Character c = input.chars()
                .mapToObj(e -> Character.toLowerCase(Character.valueOf((char) e)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(e -> e.getKey()).get();

        System.out.println(c);


        Character c1 = input.chars().mapToObj(e -> Character.toLowerCase(Character.valueOf((char) c)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(e -> e.getValue() > 1L)
                .map(e -> e.getKey()).findFirst().get();

        System.out.println(c1);


    }
}
