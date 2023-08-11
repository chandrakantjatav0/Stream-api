package streamapi;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {

        //Create a Stream
        Stream<String> stream1 = Stream.of("a", "b", "c");
        stream1.forEach(System.out::println);

        //Collection a Stream from Sources
        Collection<String> collection = Arrays.asList("Java", "SQL", "Hibernate", "SpringBoot");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        List<String> list = Arrays.asList("Java", "SQL", "Hibernate", "SpringBoot");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);

        String[] strArray = {"x", "y", "z"};
        Stream<String> stream5 = Arrays.stream(strArray);
        stream5.forEach(System.out::println);
    }
}
