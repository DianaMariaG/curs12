package ro.fasttrackit.curs12.homework.ex3;

import ro.fasttrackit.curs12.homework.ex2.HairColours;
import ro.fasttrackit.curs12.homework.ex2.Person;
import ro.fasttrackit.curs12.homework.ex2.StringUtils;

import java.util.Objects;

import static ro.fasttrackit.curs12.homework.ex2.StringUtils.*;

public class Employee extends Person {
    private final String company;
    private final int salary;

    public Employee(String name, int age, HairColours hairColour, String company, int salary) {
        super(name, age, hairColour);
        this.company = ensureNotEmpty(company);
        this.salary = positiveValue(salary);
    }

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public int getAge() {
        return super.getAge();
    }
    @Override
    public HairColours getHairColour() {
        return super.getHairColour();
    }
    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(company, employee.company);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), company, salary);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
