package streamapipractice;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//Remove duplicate elements from a list of integers using the Stream API.
public class DistinctNumbers {
    public static void main(String[] args) {
        List<Integer> duplinum = List.of(1, 3, 45, 67, 2, 2, 45, 6, 8, 3, 9);
        List<Integer> withoutduplinum = duplinum.stream().distinct().collect(Collectors.toList());
        System.out.println("Duplicate Numbers from List : " + duplinum);
        System.out.println("Without Duplicates Numbers From list :" + withoutduplinum);

        List<Integer> numbers = List.of(1, 2, 3, 4, 3, 2, 5, 6, 1, 7, 8, 9, 7, 10);
        List<Integer> distinctNumbers = numbers.stream()
                .collect(Collectors.toCollection(LinkedList::new))
                .stream()
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("List with Duplicates Removed (Preserving Order): " + distinctNumbers);
    }
}

