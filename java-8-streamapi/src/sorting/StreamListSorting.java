package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("WaterMelon");
        fruits.add("Mango");

        List<String> sortedList1 = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList1);

        List<String> sortedlist2 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sortedlist2);

        List<String> sortedList3 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList3);

        //list to Descending Order
        List<String> sortedList4 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList4);

        List<String> sortedList5 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(sortedList5);

        //Sort Employeee By Salary in Acending Order
        List<Employee> employee = new ArrayList<Employee>();
        employee.add(new Employee(101, "Chandrakant", 21, 43600f));
        employee.add(new Employee(102, "Vivek", 22, 38000f));
        employee.add(new Employee(103, "Aditya", 23, 36000f));
        employee.add(new Employee(104, "Sushma", 21, 29000f));
        employee.add(new Employee(105, "Meghna", 22, 36700f));

        List<Employee> employeeSortedList = employee.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());
        System.out.println(employeeSortedList);
        //From Lambda Expression
        List<Employee> employeeSortedList1 = employee.stream()
                .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        System.out.println(employeeSortedList1);
        //From Swap the Salary in Decending order Bigger First/Reversed
        List<Employee> employeeSortedList3 = employee.stream()
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
        System.out.println(employeeSortedList3);
        //from Comparator Method into Ascending order
        List<Employee> employeeSortedList4 = employee.stream()
                .sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(employeeSortedList4);//Ascending Order
        //from Comparator Method into Descending order
        List<Employee> employeeSortedList5 = employee.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println("Comparator Method Descending : \n" + employeeSortedList5);//Descending Order
        //From Comparator method To find From Age
        List<Employee> employeeSortedList6 = employee.stream()// get From Age
                .sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
        System.out.println("Comparator Method to Find from  Age : \n" + employeeSortedList6);
        //From Comparator method To find From Age Reversed
        List<Employee> employeeSortedList7 = employee.stream()// get From Age Reversed
                .sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
        System.out.println("Comparator Method to Find from  Age reversed : \n" + employeeSortedList7);
//From Comparator method To find From Name
        List<Employee> employeeSortedList8 = employee.stream()// get From Name
                .sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toList());
        System.out.println("Comparator Method to Find from  Name  : \n" + employeeSortedList8);
        //From Comparator method To find From Name
        List<Employee> employeeSortedList9 = employee.stream()// get From Name Reverzed
                .sorted(Comparator.comparing(Employee::getEmpName).reversed()).collect(Collectors.toList());
        System.out.println("Comparator Method to Find from  Name  Reversed : \n" + employeeSortedList9);
    }
}
