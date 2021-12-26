package ro.fasttrackit.curs12.homework.ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentsMap {
    public static void main(String[] args) {
        Map<String, Double> students = new HashMap<>();
        students.put("Ana",8.5);
        students.put("Clara",7.3);
        students.put("Sergiu",6.0);
        students.put("Diana",10.0);

        System.out.println(students.entrySet());
        System.out.println(findBestStudent(students));

    }
    private static String findBestStudent(Map<String, Double> students) {
        double maxGrade = Integer.MIN_VALUE;
        String bestStudent = "";
        for (String student : students.keySet()) {
            if (maxGrade < students.get(student)) {
                maxGrade = students.get(student);
                bestStudent = student;
            }
        }
        return bestStudent;
    }
}
