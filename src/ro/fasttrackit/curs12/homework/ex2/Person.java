package ro.fasttrackit.curs12.homework.ex2;

import java.util.Objects;

import static ro.fasttrackit.curs12.homework.ex2.StringUtils.*;

public class Person {
    private final String name;
    private final int age;
    private final HairColours hairColour;

    public Person(String name, int age, HairColours hairColour) {
        this.name = ensureNotEmpty(name);
        this.age = validAge(age);
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HairColours getHairColour() {
        return hairColour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && hairColour == person.hairColour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hairColour);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColour=" + hairColour +
                '}';
    }
}
