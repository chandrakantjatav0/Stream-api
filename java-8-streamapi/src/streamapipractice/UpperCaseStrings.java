package streamapipractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
//Given a list of strings, convert each string to uppercase using the Stream API
      and collect the uppercase strings into a new list.
 */
public class UpperCaseStrings {
    public static void main(String[] args) {
        //Type 1 list.of using stream.map.forEach
        List<String> name = List.of("chandu", "vivek", "sussma", "aaditya");
        name.stream().map(i -> i.toUpperCase()) // Convert each name to uppercase
                .forEach(System.out::println); // // Print each uppercase name
        //Type 2
        List<String> movies = Arrays.asList("kantara", "lootcase", "tumbaad", "jl50", "masaan");
        List<String> newMovies = movies.stream().map(String::toUpperCase) //convert to uppercase
                .collect(Collectors.toList());
        System.out.println("The original list : " + movies);
        System.out.println("The UpperCase list : " + newMovies);
    }
}
