package com.mistral.movies.errors;

import org.springframework.http.HttpStatus;

import java.sql.Timestamp;

public class ExceptionData {

    private final String message;
    private final Throwable throwable;
    private final HttpStatus status;
    private final Timestamp timestamp;

    public ExceptionData(String message, Throwable throwable, HttpStatus status, Timestamp timestamp) {
        this.message = message;
        this.throwable = throwable;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
