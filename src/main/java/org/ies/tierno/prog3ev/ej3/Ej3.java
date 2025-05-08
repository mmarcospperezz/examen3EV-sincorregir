package org.ies.tierno.prog3ev.ej3;


import lombok.extern.log4j.Log4j;
import org.ies.tierno.prog3ev.model.Student;

import java.util.Comparator;
import java.util.TreeSet;

@Log4j
public class Ej3 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(
                Comparator
                        .comparing(Student::getName)
                        .thenComparing(Student::getSurname)
                        .thenComparing(Student::getNif)
        );

        students.add(
                new Student("2X", "George", "Pig", 2000)
        );
        students.add(
                new Student("3X", "Peppa", "Pig", 2000)
        );
        students.add(
                new Student("1X", "Bob", "Esponja", 2000)
        );

        for (var student : students) {
            log.info(student);
        }
    }
}
