package org.ies.tierno.prog3ev.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Data
public class Highschool {
    private String name;
    private Map<String, Professor> professorByNif;
    private List<Course> courses;
}
