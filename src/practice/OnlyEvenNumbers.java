package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OnlyEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).toList();

        System.out.println(evenList);

        List<Integer> oddList = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println(oddList);


    }
}
