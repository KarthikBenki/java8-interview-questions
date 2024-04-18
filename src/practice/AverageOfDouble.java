package practice;

import java.util.Arrays;
import java.util.List;

public class AverageOfDouble {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(1.0, 1.3, 1.5, 2.4);

        double v2 = list.stream().mapToDouble(e -> e).average().orElse(0.0);

        double v = list.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

        System.out.println(v);

        double v1 = list.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

        System.out.println(v1);

        double asDouble = list.stream().mapToDouble(e -> Double.valueOf(e)).average().getAsDouble();

        System.out.println(asDouble);
    }
}
