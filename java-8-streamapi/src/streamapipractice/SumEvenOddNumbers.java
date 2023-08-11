package streamapipractice;

import java.util.stream.IntStream;

public class SumEvenOddNumbers {
    public static void main(String[] args) {
        int[] numbers = IntStream.rangeClosed(1, 100).toArray();

        int sumEven = IntStream.of(numbers)

                .filter(n -> n % 2 == 0)
                .sum();

        int sumOdd = IntStream.of(numbers)

                .filter(n -> n % 2 != 0)
                .sum();

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}