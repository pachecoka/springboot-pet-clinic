package com.dev.karol.petclinic.core.exceptions;

public class ConsultNotFoundException extends RuntimeException {

    public ConsultNotFoundException(String message) {
        super(message);
    }
}
