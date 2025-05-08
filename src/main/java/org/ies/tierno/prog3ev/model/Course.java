package org.ies.tierno.prog3ev.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.tierno.prog3ev.exceptions.StudentNotFoundException;

import java.util.Map;
import java.util.TreeSet;

@AllArgsConstructor
@Data
public class Course{
    private int id;
    private String name;
    private int credits;
    private String professorNif;
    private TreeSet<Student> students;

    public  Boolean hasStudent (String nif){
        for (var student : students) {
            if (student.getNif().equals(nif)) {
                return true;
            }
        }
        return false;
    }

    public Student findStudent(String nif) throws StudentNotFoundException {
        for(var student: students) {
            if(student.getNif().equals(nif)) {
                return student;
            }
        }
        throw new StudentNotFoundException(nif);
    }
}
