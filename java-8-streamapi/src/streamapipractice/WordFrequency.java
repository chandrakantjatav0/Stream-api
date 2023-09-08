package streamapipractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Count the frequency of words in a list of strings using
the Stream API and store the results in a map.
 */
public class WordFrequency {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "dobara na milegi zindagi" + "kabhi khushi kabhi gham" +
                        "zindagi na milegi dobara" + "gham khushi kabhi kabhi");
        // Split the strings into words and flatten them into a single stream of words
        List<String> words = stringList.stream().flatMap(line -> Arrays.stream(line.split(" ")))
                .collect(Collectors.toList());
        // Count the frequency of each word and store the results in a map
        Map<String, Long> wordFrequencyMap = words.stream().collect(Collectors
                .groupingBy(String::toLowerCase, Collectors.counting()));
        // Print the word frequency map
        System.out.println("Word Frequency Map : " + wordFrequencyMap);
    }
}
