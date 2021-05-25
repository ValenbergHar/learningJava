package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Gsdfsf", 34),
                new Person("Fdhzdfdsf", 34),
                new Person("Tfhjshjfdsf", 24),
                new Person("Jghghxffdhsf", 44),
                new Person("Rsfgdsf", 14),
                new Person("Adsf", 34),
                new Person("Ada", 34)

        );

//        List<Person> filtered =personList.stream()
//                .filter(p -> p.name.startsWith("A"))
//                .collect(Collectors.toList());
//
//        System.out.println(filtered);


//        Map<Integer, List<Person>> personByAge = personList
//                .stream()
//                .collect(Collectors.groupingBy(p -> p.age));
//
//        personByAge.forEach((age, p)-> System.out.format("age %s: %s\n", age, p));

        List<String> sortedPerson = personList
                .stream()
                .filter(person -> person.age > 20)
                .map(person -> person.name)
                .sorted((a,b)->a.length()-b.length())
                .collect(Collectors.toList());

        System.out.println(sortedPerson);

    }
}
