package streamapipractice;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Given a list of persons with names and ages, group them by age and
collect the groups into a map using the Stream API.
 */
public class GroupingByAge {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Chandrakant", 21), new Person("Aditya", 23),
                new Person("Sushma", 22), new Person("Rohit", 22), new Person("Vivek", 22));
        Map<Integer, List<Person>> groupByAge = personList.stream().collect(Collectors.groupingBy(Person::getAge));

        groupByAge.forEach((age, people) -> {
            System.out.println("Age : " + age);
            System.out.println("People : " + people + "\n");
        });
    }
}
