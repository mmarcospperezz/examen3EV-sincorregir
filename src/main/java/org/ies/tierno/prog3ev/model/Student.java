package org.ies.tierno.prog3ev.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {
    private String nif;
    private String name;
    private String surname;
    private int zipCode;
}
