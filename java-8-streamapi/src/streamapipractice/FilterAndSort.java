package streamapipractice;

import java.util.List;
import java.util.stream.Collectors;

/*
Filter out strings that start with the letter "A" from a list of strings,
 sort them, and collect them into a new list using the Stream API.
 */
public class FilterAndSort {
    public static void main(String[] args) {
        List<String> stringList = List.of("Aaditya", "Gautam", "Akanshaa", "Vivek", "Anushkaa", "Suhana", "Aahana");
        List<String> list = stringList.stream().filter(i -> i.startsWith("A")).sorted().collect(Collectors.toList());
        System.out.println("Original List : " + stringList);
        System.out.println("Filter and Sorted the letter from 'A' name : " + list);
    }
}
