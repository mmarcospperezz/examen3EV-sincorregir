package org.ies.tierno.prog3ev.exceptions;

public class StudentNotFoundException extends Exception {
  private final String nif;

  public StudentNotFoundException(String nif) {
    this.nif = nif;
  }

  public String getNif() {
    return nif;
  }
}
