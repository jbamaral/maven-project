package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Just fixing javadoc to test checkstyle.
   * @param someone the name of the person
   * @return greeting string with person's name
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
