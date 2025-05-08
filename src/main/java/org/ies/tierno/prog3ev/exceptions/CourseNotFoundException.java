package org.ies.tierno.prog3ev.exceptions;

public class CourseNotFoundException extends Exception {
  private final int id;

  public CourseNotFoundException(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }
}
