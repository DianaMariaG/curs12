package ro.fasttrackit.curs12.homework.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonHandler {
    private final List<Person> persons;

    public PersonHandler(List<Person> listOfPersons) {
        if (listOfPersons == null) {
            this.persons = new ArrayList<>();
        } else {
            this.persons = new ArrayList<>(listOfPersons);
        }
    }
    public List<String> getListOfPersonsName() {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(person.getName());
        }
        return result;
    }

    public Map<String, Integer> mapNameToAge() {
        Map<String, Integer> result = new HashMap<>();
        for(Person person : persons) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }
    public List<Person> personsOlderThanGivenAge (int givenAge) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > givenAge) {
                result.add(person);
            }
        }
        return result;
    }

    //extract a map from person's hair colour to their name (String->List<String>)
    public Map<HairColours, List<String>> mapHairToNames() {
        Map<HairColours, List<String>> result = new HashMap<>();
        for (Person person : persons) {
            List<String> personsName = result.get(person.getHairColour());

            if (personsName == null) {
                personsName = new ArrayList<>();
                result.put(person.getHairColour(), personsName);
            }
            personsName.add(person.getName());
        }
        return result;
    }

    public Map<Integer, List<Person>> mapAgeToListOfPersons() {
        Map<Integer, List<Person>> result = new HashMap<>();
        for (Person person : persons) {
            List<Person> personsOfSameAge = result.get(person.getAge()); // pt fiecare age se ia lista corespunzatoare din map

            if (personsOfSameAge == null) {
                personsOfSameAge = new ArrayList<>();
                result.put(person.getAge(), personsOfSameAge);
            }
            personsOfSameAge.add(person);
        }
        return result;
    }
}
