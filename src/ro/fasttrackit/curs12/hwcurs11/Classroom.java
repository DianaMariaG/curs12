package ro.fasttrackit.curs12.hwcurs11;

import ro.fasttrackit.curs12.hwcurs11.StudentGrade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> students = new ArrayList<>(); //final e referinta, nu continutul; variabila studneti va indica mereu spre adresa 178474

    public Classroom(List<StudentGrade> students) {
        this.students.addAll(students != null ? students : Collections.emptyList());
    }

    List<Integer> getGradesForDiscipline (String discipline) {
        List<Integer> result = new ArrayList<>();
        for (StudentGrade student : students) {
            if (discipline == null || student.discipline().equalsIgnoreCase(student.discipline())) {
                result.add(student.grade());
            }
        }
        return result;
    }
}
