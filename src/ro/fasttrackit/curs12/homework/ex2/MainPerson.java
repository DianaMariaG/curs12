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

        PersonHandler listOfPersone = new PersonHandler(List.of(person1,person2,person3,person4,person5));
        System.out.println(listOfPersone);

        System.out.println(listOfPersone.getListOfPersonsName());
        System.out.println(listOfPersone.mapNameToAge());
        System.out.println(listOfPersone.personsOlderThanGivenAge(30));
        System.out.println(listOfPersone.mapHairToNames());
        System.out.println(listOfPersone.mapAgeToListOfPersons());
    }
}
