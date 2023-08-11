package streamapipractice;

import java.util.Arrays;
import java.util.List;

//Find the length of the longest string in a list of strings using the Stream API.
public class LongestStringLength {
    public static void main(String[] args) {
        List<String> milkshakes = Arrays.asList("ChocolateMilkShake", "BananaMilkShake", "ChocolateOreoMilkShake", "StrawberryMilkshake");
        int maxLength = milkshakes.stream().mapToInt(String::length) // Convert each string to its length
                .max()    // Find the maximum length
                .orElse(0);  // If the list is empty, return 0
        System.out.println("The Length of the Longest String : " + maxLength);
        // print the longest string with length
        String longestString = milkshakes.stream().max((s1, s2) -> Integer.compare
                        (s1.length(), s2.length()))//// Find the longest string using a custom comparator
                .orElse("");// If the list is empty, return an empty string
        System.out.println("The Longest String : " + longestString);
        System.out.println("The Length of the Longest String : " + longestString.length());

    }
}