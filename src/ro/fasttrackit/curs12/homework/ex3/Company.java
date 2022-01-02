package ro.fasttrackit.curs12.homework.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
    private final List<Employee> employees;

    public Company(List<Employee> listOfEmployees) {
        if (listOfEmployees == null) {
            this.employees = new ArrayList<>();
        } else {
            this.employees = new ArrayList<>(listOfEmployees);
        }
    }

    public List<Employee> getPersonsWithBiggerSalaries (int minimumSalary) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() > minimumSalary) {
                result.add(employee);
            }
        }
        return result;
    }

    public Map<String, List<Employee>> mapCompanyToEmployee() {
        Map<String, List<Employee>> result = new HashMap<>();
        for (Employee employee : employees) {
            List<Employee> allEmployees = result.get(employee.getCompany());

            if (allEmployees == null) {
                allEmployees = new ArrayList<>();
                result.put(employee.getCompany(), allEmployees);
            }
            allEmployees.add(employee);
        }
        return result;
    }

    public int getSalariesSum() {
        int salariesSum = 0;
        for (Employee employee : employees) {
            salariesSum = salariesSum + employee.getSalary();
        }
        return salariesSum;
    }

    public String getCompanyWithBiggestSalary() {
        String resultCompany = null;
        int maxSalary = 0;
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                resultCompany = employee.getCompany();
            }
        }
        return resultCompany;
    }
}
