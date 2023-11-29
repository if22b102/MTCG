package at.fhtw.users.service;

import at.fhtw.httpserver.http.ContentType;
import at.fhtw.httpserver.http.HttpStatus;
import at.fhtw.httpserver.server.Request;
import at.fhtw.httpserver.server.Response;
import at.fhtw.users.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserService extends AbstractUser {
    public UserService() {

    }

    // GET /weather(:id
    public Response getUsers(String id) {
        User user = new User("admin", "test");
        String Json = null;
        try {
            Json = this.getObjectMapper().writeValueAsString(user);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return new Response(HttpStatus.OK, ContentType.JSON, Json);
    }

    // GET /weather
    public Response getUser() {
        User user = new User("admin", "test");
        String Json = null;
        try {
            Json = this.getObjectMapper().writeValueAsString(user);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return new Response(HttpStatus.OK, ContentType.JSON, Json);
    }

    // POST /weather
    public Response addUser(Request request) {
        try {
            User newUser = extractUserFromRequest(request);

            return new Response(HttpStatus.CREATED, ContentType.JSON, toJson(newUser));
        } catch (Exception e) {
            return new Response(HttpStatus.BAD_REQUEST, ContentType.JSON, "Fehler beim Hinzufügen des Benutzers: " + e.getMessage());
        }
    }


    // gleich wie "public Response getWeather()" nur mittels Repository
    public Response getWeatherPerRepository() {
        return new Response(HttpStatus.NOT_IMPLEMENTED);
    }

    // Extrahiert einen User aus dem Request-Objekt
    private User extractUserFromRequest(Request request) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = request.getBody();
        return objectMapper.readValue(requestBody, User.class);
    }

    // Konvertiert ein User-Objekt in JSON
    private String toJson(User user) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(user);
    }
}
