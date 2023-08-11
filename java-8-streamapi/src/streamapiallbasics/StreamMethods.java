package streamapiallbasics;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        //filter (Predicate) // returns Boolean
        //Boolean Value Function

        //map(Function)  //Function returns Value
        /*
                each element operation
         */
        List<String> citiesName = List.of("Mumbai", "Mumbra", "Mangalore", "Dombivli", "Dadar", "Mysore");
        List<String> newCities = citiesName.stream().filter(i -> i.startsWith("M")).collect(Collectors.toList());
        System.out.println("The City Starts From M are : " + newCities); //  filter Method

        List<Integer> numbers = List.of(23, 2, 64, 56, 7, 9);
        List<Integer> newNumbers = numbers.stream().map(k -> k * k).collect(Collectors.toList());
        System.out.println("The Square root of this no. are :" + newNumbers); // Map method

        citiesName.stream().forEach(
                e -> {
                    System.out.println(e);  // forEach method type1
                }
        );
        newCities.stream().forEach(System.out::println);   // forEach method type2
        //sort
        numbers.stream().sorted().forEach(System.out::println); // its change and sorted the no.

        Integer integer1 = numbers.stream().min((x, y) -> x.compareTo(y)).get(); // min
        System.out.println("Min no. is : " + integer1);      //use forEach when we have list of no.
        Integer integer2 = numbers.stream().max((x, y) -> x.compareTo(y)).get();// max
        System.out.println("Max no. is : " + integer2);
    }
}
