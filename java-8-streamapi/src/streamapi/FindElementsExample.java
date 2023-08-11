package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementsExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 1);
        //Find Any first() and Any() methods
        Optional<Integer> elements1 = list.stream().findFirst();
        if (elements1.isPresent()) {
            System.out.println(elements1.get());
        } else {
            System.out.println("Stream is Empty..");
        }
        Optional<Integer> elements2 = list.stream().findAny();
        if (elements2.isPresent()) {
            System.out.println(elements2.get());
        } else {
            System.out.println("Stream is Empty..");
        }
    }
}
