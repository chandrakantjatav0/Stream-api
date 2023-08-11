package streamapiallbasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddEvenStream {
    public static void main(String[] args) {

// Q1.) Create a list and Filer All Even Numbers
        //First we try  All Methods to make a List
        List<Integer> list1 = List.of(2, 7, 88, 43, 56, 12, 59, 34, 45);//this method of list.of is fixed we cannot add other inputs on it
        //Second Method
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(67);
        list2.add(679);
        list2.add(34);
        list2.add(23);
        list2.add(293);
        List<Integer> list3 = Arrays.asList(12, 27, 83, 45, 99, 72, 39);
        //using List1 without Stream
        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list1) {
            if (i % 2 == 0) {
                listEven.add(i);
            }
        }
        System.out.println("All Numbers in List : " + list1);
        System.out.println("Even Number from the List1 without Stream : " + listEven);

        //Using List1 with Stream for Even
        Stream<Integer> stream1 = list1.stream();
        List<Integer> newlist1 = stream1.filter(i -> i % 2 == 0).collect(Collectors.toList());//Type 1
        List<Integer> nlist1 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());//Type2
        //Using List1 with Stream for Odd
        Stream<Integer> stream2 = list1.stream();
        List<Integer> newlist2 = stream2.filter(i -> i % 2 != 0).collect(Collectors.toList());//Type1
        List<Integer> nlist2 = list1.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());//Type2

        System.out.println("Even Number from the List1 with Stream : " + newlist1);
        System.out.println("Odd Number from the List1 with Stream : " + newlist2);
        System.out.println("Even Number shortlisted code Of with Stream " + nlist1);
        System.out.println("Odd Number shortlisted code Of with Stream " + nlist2);

        //Find the bigger and smaller no. from given value
        List<Integer> bigNo = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println("The bigger no. from 10 are  : " + bigNo);
        List<Integer> smallno = list1.stream().filter(i -> i < 40).collect(Collectors.toList());
        System.out.println("The smaller no. from 40 are : " + smallno);

    }
}
