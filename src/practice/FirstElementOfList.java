package practice;

import java.util.*;

public class FirstElementOfList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        list.stream().findFirst().ifPresent(System.out::println);

        // second largest element



        HashSet<Integer> set = new HashSet<>();

        Integer secondlargest = list.stream()
                .filter(e -> set.add(e))
                .sorted(Comparator.reverseOrder())
                        .skip(1)
                                .findFirst().orElse(0);

        HashSet<Integer> integers = new HashSet<>();

        Optional<Integer> first = list.stream().filter(e -> integers.add(e)).sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first.get());


        System.out.println(secondlargest);

        // total numbers of elements in the streasm

        long count = list.stream().count();

        System.out.println(count);

        // max value in stream

        Integer i = list.stream().max(Comparator.comparingInt(Integer::intValue)).orElse(0);

        System.out.println(i);
        HashSet<Integer> set1 = new HashSet<>();

        Integer i1 = list.stream().filter(e -> set1.add(e)).sorted(Comparator.reverseOrder()).findFirst().orElse(0);

        System.out.println(i1);

        HashSet<Integer> integers1 = new HashSet<>();

        Integer i2 = list.stream().filter(e -> integers1.add(e)).sorted(Comparator.reverseOrder()).findFirst().get();

        System.out.println(i2);
    }
}
