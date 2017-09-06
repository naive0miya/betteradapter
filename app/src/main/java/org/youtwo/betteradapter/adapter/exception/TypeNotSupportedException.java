package org.youtwo.betteradapter.adapter.exception;

/**
 * Created by Bill on 2017/9/6.
 */

public class TypeNotSupportedException extends RuntimeException {
  private TypeNotSupportedException(String message) {
    super(message);
  }

  public static TypeNotSupportedException create(String message) {
    return new TypeNotSupportedException(message);
  }
}
