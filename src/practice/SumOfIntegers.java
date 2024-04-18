package practice;

import java.util.Arrays;
import java.util.List;

public class SumOfIntegers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int sum = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);

        Integer reduce = list.stream().reduce(0, (a, b) -> a + b);

        System.out.println(reduce);


    }
}
