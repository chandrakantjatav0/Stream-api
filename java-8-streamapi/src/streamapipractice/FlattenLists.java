package streamapipractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenLists {
    public static void main(String[] args) {
        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.add(Arrays.asList(1, 2, 3, 4));
        listOfList.add(Arrays.asList(5, 6, 7, 8));
        listOfList.add(Arrays.asList(9, 10, 0, 11, 12));
        List<Integer> flattenList = listOfList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("Flatten List : " + flattenList);
    }
}
