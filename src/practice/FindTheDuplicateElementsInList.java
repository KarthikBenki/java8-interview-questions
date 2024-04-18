package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheDuplicateElementsInList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        HashSet<Integer> integers = new HashSet<>();

        List<Integer> collect = list.stream().filter(e -> !integers.add(e)).collect(Collectors.toList());

        System.out.println(collect);

        HashSet<Integer> integers1 = new HashSet<>();

        List<Integer> collect1 = list.stream().filter(e -> !integers1.add(e)).collect(Collectors.toList());

        System.out.println(collect1);
    }
}
