package ro.fasttrackit.curs12.homework.ex2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonHandler {
    private final List<Person> listOfPersons;

    public PersonHandler(List<Person> listOfPersons) {
        if (listOfPersons == null) {
            this.listOfPersons = new ArrayList<>();
        } else {
            this.listOfPersons = new ArrayList<>(listOfPersons);
        }
    }
    public List<String> getListOfPersonsName() {
        List<String> result = new ArrayList<>();
        for (Person person : listOfPersons) {
            result.add(person.getName());
        }
        return result;
    }

    public Map<String, Integer> mapNameToAge() {
        Map<String, Integer> result = new HashMap<>();
        for(Person person : listOfPersons) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }
    public List<Person> personsOlderThanGivenAge (int givenAge) {
        List<Person> result = new ArrayList<>();
        for (Person person : listOfPersons) {
            if (person.getAge() > givenAge) {
                result.add(person);
            }
        }
        return result;
    }

    //extract a map from person's hair colour to their name (String->List<String>)
    public Map<String, List<String>> mapHairToNames() {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : listOfPersons) {
            List<String> personsName = result.get(person.getHairColour().toString());

            if (personsName == null) {
                personsName = new ArrayList<>();
                result.put(person.getHairColour().toString(), personsName);
            }
            personsName.add(person.getName());
        }
        return result;
    }

    public Map<Integer, List<Person>> mapAgeToListOfPersons() {
        Map<Integer, List<Person>> result = new HashMap<>();
        for (Person person : listOfPersons) {
            List<Person> personsOfSameAge = result.get(person.getAge()); // pt fiecare age se ia lista corespunzatoare din map

            if (personsOfSameAge == null) {
                personsOfSameAge = new ArrayList<>();
                result.put(person.getAge(), personsOfSameAge);
            }
            personsOfSameAge.add(person);
        }
        return result;
    }

    @Override
    public String toString() {
        return "PersonHandler{" +
                "listOfPersons=" + listOfPersons +
                '}';
    }
}
