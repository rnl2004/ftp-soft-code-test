package com.ftp.coding.challenge.exception;

public class DBConnectorException extends RuntimeException {

  private static final long serialVersionUID = -7645327082304515933L;

  public DBConnectorException(String message) {
    super(message);
  }

  public DBConnectorException(Throwable cause) {
    super(cause);
  }

  public DBConnectorException(String message, Throwable cause) {
    super(message, cause);
  }
}
