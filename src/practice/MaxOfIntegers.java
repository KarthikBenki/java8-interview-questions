    package practice;

    import java.util.Arrays;
    import java.util.Comparator;
    import java.util.List;
    import java.util.OptionalInt;

    public class MaxOfIntegers {
        public static void main(String[] args) {
            // Create a list of integers
            List<Integer> list = Arrays.asList(10, 20, 1, 5, 7, 12, 30);

            // Find the maximum value using streams
            Integer max = list.stream()
                    .max(Integer::compareTo)  // Compare elements using natural ordering
                    .orElse(0);                // If no max found, return 0

            // Print the maximum value
            System.out.println(max);

            Integer i = list.stream().max(Integer::compareTo).orElse(0);

            System.out.println(i);

            int asInt = list.stream().mapToInt(Integer::intValue).max().getAsInt();

            System.out.println(asInt);

        }
    }
