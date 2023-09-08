package streamapipractice;
import java.util.stream.Stream;
//Generate a stream of prime numbers using the Stream API and a custom prime-checking function
public class PrimeNumbers {
    public static void main(String[] args) {
        Stream<Integer> primeStream = Stream.iterate(2, n -> n + 1)
                .filter(PrimeNumbers::isPrime)
                .limit(10); // Change the limit as needed
        primeStream.forEach(System.out::println);
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
