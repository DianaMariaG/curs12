package ro.fasttrackit.curs12.homework.ex2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

import static ro.fasttrackit.curs12.homework.ex2.HairColours.*;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Diana",24, POLYCHROMATIC);
        Person person2 = new Person("Julia",35,BLONDE);
        Person person3 = new Person("Steve",24,BLACK);
        Person person4 = new Person("Laur", 40,BLACK);
        Person person5 = new Person("Sofia",67,BLONDE);
        Person person6 = new Person("Peter",40,RED);

        PersonHandler persons = new PersonHandler(List.of(person1,person2,person3,person4,person5,person6));
        System.out.println(persons);

        System.out.println(persons.getListOfPersonsName());
        System.out.println(persons.mapNameToAge());
        System.out.println(persons.personsOlderThanGivenAge(30));
        System.out.println(persons.mapHairToNames());
        System.out.println(persons.mapAgeToListOfPersons());
    }
}
