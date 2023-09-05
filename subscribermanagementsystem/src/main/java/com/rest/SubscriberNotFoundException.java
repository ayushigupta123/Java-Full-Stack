package com.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SubscriberNotFoundException extends RuntimeException {
    public SubscriberNotFoundException(Long id) {
        super("Subscriber not found with ID: " + id);
    }
}
