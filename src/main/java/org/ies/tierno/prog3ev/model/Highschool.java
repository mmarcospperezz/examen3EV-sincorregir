package org.ies.tierno.prog3ev.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.tierno.prog3ev.exceptions.CourseNotFoundException;
import org.ies.tierno.prog3ev.exceptions.StudentNotFoundException;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

@AllArgsConstructor
@Data
public class Highschool {
    private String name;
    private Map<String, Professor> professorByNif;
    private List<Course> courses;

    public List<Course> findStudentCourses(String nif) {
        List<Course> studentCourses = new LinkedList<>();
        for (var course : courses) {
            if (course.hasStudent(nif)) {
                studentCourses.add(course);
            }
        }
        return studentCourses;
    }

    public Student findStudent(int courseId, String nif) throws CourseNotFoundException, StudentNotFoundException {
        var course = findCourse(courseId);
        return course.findStudent(nif);
    }

    private Course findCourse(int courseId) throws CourseNotFoundException {
        for (var course : courses) {
            if (course.getId() == courseId) {
                return course;
            }
        }
        throw new CourseNotFoundException(courseId);
    }

    public TreeSet<Student> findZipCodeStudents(int zipCode) {
        return courses
                .stream()
                .flatMap(course -> course.getStudents().stream())
                .filter(student -> student.getZipCode() == zipCode)
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
