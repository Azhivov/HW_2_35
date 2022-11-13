package com.example.hw_2_35.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFoundExceptions extends RuntimeException{
    public EmployeeNotFoundExceptions() {
    }

    public EmployeeNotFoundExceptions(String message) {
        super(message);
    }

    public EmployeeNotFoundExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeNotFoundExceptions(Throwable cause) {
        super(cause);
    }

    public EmployeeNotFoundExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
