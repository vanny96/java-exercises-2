package com.vanny96;

import java.util.ArrayList;
import java.util.Collections;

 public class App { 
    public static void main( String[] args ){
        ArrayList<Person> persons = new ArrayList<Person>();

        persons.add(new Person("pekka", 1000));
        persons.add(new Person("mikel", 699));
        persons.add(new Person("bob", 10));
        persons.add(new Person("rachel", 1230));
        persons.add(new Person("rox", 1000));

        Collections.sort(persons);
 
        for(Person person : persons){
            System.out.println(person);
        }
    }
}
