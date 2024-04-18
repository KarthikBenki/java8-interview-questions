package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvenNumbers {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};

        List<Integer> collect = Arrays.stream(a).boxed().filter(n -> n % 2 == 0).collect(Collectors.toList());


        System.out.println(collect);


    }
}
