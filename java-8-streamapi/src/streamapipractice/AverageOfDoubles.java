package streamapipractice;

import java.util.*;
import java.util.stream.*;

public class AverageOfDoubles {
    public static void main(String[] args) {
        List<Double> doubleList = List.of(9.1, 2.99, 22.03, 88.23, 35.499, 99.9999999);
        double average = doubleList.stream()
                .mapToDouble(Double::doubleValue) // Convert to DoubleStream
                .average() // Calculate average (returns OptionalDouble)
                .orElse(0.0); // Default value if list is empty
        System.out.println("Average of the Double list is : " + average);
    }
}
