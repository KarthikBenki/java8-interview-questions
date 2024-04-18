package practice;

import java.util.Arrays;
import java.util.List;

public class ConcatStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", " ", "world", "!");

        String reduce = words.stream().reduce("", (a,b) -> a.concat(b));

        String reduce1 = words.stream().reduce("", (a, b) -> a.concat(b));

        System.out.println(reduce1);

        System.out.println(reduce);

        String reduce2 = words.stream().reduce("", (a, b) -> a.concat(b));

        System.out.println(reduce2);
    }
}
