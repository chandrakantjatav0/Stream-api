package streamapiallbasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //StreamAPI - collection
        //Collection - Group of Object
        //1 Blank
        Stream<Object> emptyStream = Stream.empty();
        //2 - Array , object , Collection
        String names[] = {"Chandrakant", "Vivek", "Sushma", "Aaditya"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });
        //3
        Stream<Object> streamBuilder = Stream.builder().build();
        //2
        IntStream stream = Arrays.stream(new int[]{2, 56, 6, 33, 64, 23});
        stream.forEach(e -> {
            System.out.println(e);
        });
        //5 list,Set, most useby
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(67);
        list2.add(679);
        list2.add(34);
        list2.add(23);
        list2.add(293);
        Stream<Object> stream2 = list2.stream();
        stream2.forEach(e -> {
            System.out.println(e);
        });

    }
}
