package com.todo.backend.exception;

public class TaskNotFoundException extends RuntimeException {

    // Constructor that accepts a custom message
    public TaskNotFoundException(String message) {
        super(message);  // Pass the message to the parent class (RuntimeException)
    }

    // Constructor that accepts both a custom message and the cause (another exception)
    public TaskNotFoundException(String message, Throwable cause) {
        super(message, cause);  // Pass both the message and cause to the parent class
    }
}
