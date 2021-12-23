package ro.fasttrackit.curs12.hwcurs11;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom(
                List.of(
                   new StudentGrade("Matia","Java",10),
                   new StudentGrade("Alex","Java",7),
                   new StudentGrade("David","matematica",9)
                )
        );

        System.out.println(classroom.getGradesForDiscipline("java"));
    }
}
