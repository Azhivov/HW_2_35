package com.example.hw_2_35.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeAlreadyAddExceptions extends RuntimeException{
    public EmployeeAlreadyAddExceptions() {
    }

    public EmployeeAlreadyAddExceptions(String message) {
        super(message);
    }

    public EmployeeAlreadyAddExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeAlreadyAddExceptions(Throwable cause) {
        super(cause);
    }

    public EmployeeAlreadyAddExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
