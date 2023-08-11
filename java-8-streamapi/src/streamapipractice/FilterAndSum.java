package streamapipractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Write a Java program that uses the Stream API to take a list of integers and returns the sum of all even numbers.
public class FilterAndSum {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1, 100).boxed().collect(Collectors.toList());

        int sumEven = list.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        int sumOdd = list.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers : " + sumEven);
        System.out.println("Sum od Odd numbers :" + sumOdd);

        List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> oddNumbers = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println("Even Numbers are : " + evenNumbers);
        System.out.println("OddNumbers are : " + oddNumbers);
    }
}