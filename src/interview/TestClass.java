package interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClass {

    public static void main(String[] args) {
        //("AA", "BB", "AA", "CC")

        List<String> list = Arrays.asList("AA", "BB", "AA", "CC");

        List<String> collect2 = list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey() + "->" + e.getValue()).collect(Collectors.toList());

        System.out.println(collect2);

        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        List<String> collect1 = list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey() + "->" + e.getValue())
                .collect(Collectors.toList());

        System.out.println(collect1);


        String str = "I love my India";

        Character c = str.chars().mapToObj(e -> Character.toLowerCase(Character.valueOf((char) e)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(c);

        Character c1 = str.chars().mapToObj(e -> Character.toLowerCase(Character.valueOf((char) e)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(c1);






    }
}
