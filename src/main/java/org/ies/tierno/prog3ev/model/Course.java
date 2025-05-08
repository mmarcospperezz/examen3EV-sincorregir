package org.ies.tierno.prog3ev.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@AllArgsConstructor
@Data
public class Course{
    private int id;
    private String name;
    private int credits;
    private String professorNif;
    private Map<String, Student> studentByNif;
}
