package at.fhtw.users.service;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class AbstractUser {

    private ObjectMapper objectMapper;

    public AbstractUser() {
        this.objectMapper = new ObjectMapper();
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
