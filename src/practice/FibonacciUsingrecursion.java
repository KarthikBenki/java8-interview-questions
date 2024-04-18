package practice;

public class FibonacciUsingrecursion {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static Integer   fibonacci(int n){
            if(n == 0 || n == 1) return  n;

            else
                return  fibonacci(n -1) + fibonacci(n -2);
    }
}
