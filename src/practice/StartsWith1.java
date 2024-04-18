package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        List<Integer> collect = list.stream().map(e -> e + "").filter(e -> e.startsWith("1")).map(Integer::valueOf).collect(Collectors.toList());


        System.out.println(collect);
    }
}
