package Misc.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//You have a list of people consisting of name and age. Filter all the people who are above 18 but below 30.
public class Problem1 {
    public static void main(String[] args) {
        Person person1=new Person("John",20);
        Person person2=new Person("Ron",10);
        Person person3=new Person("Don",24);
        Person person4=new Person("Con",30);
        Person person5=new Person("Troy",50);
        Person person6=new Person("Roy",70);
        Person person7=new Person("Boy",29);
        Person person8=new Person("Barak",19);
        Person person9=new Person("Obama",12);
        List<Person> people= Arrays.asList(person1,person2,person3,person4,person5,person6,person7,person8,person9);
        List<Person> eligible=people.stream().filter(person -> person.getAge()>18 && person.getAge()<30).collect(Collectors.toList());
        System.out.println(eligible);


    }
}
