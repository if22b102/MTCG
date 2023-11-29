package at.fhtw.users.controller;
import at.fhtw.httpserver.http.Method;

import at.fhtw.httpserver.http.ContentType;
import at.fhtw.httpserver.http.HttpStatus;
import at.fhtw.httpserver.server.Request;
import at.fhtw.httpserver.server.Response;
import at.fhtw.httpserver.server.RestController;
import at.fhtw.users.model.User;
import at.fhtw.users.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class UserController implements RestController {
    private final UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    @Override
    public Response handleRequest(Request request) {
        if (request.getMethod() == Method.GET &&
                request.getPathParts().size() > 1) {
            return this.userService.getUsers(request.getPathParts().get(1));
        } else if (request.getMethod() == Method.GET) {
            return this.userService.getUser();
        } else if (request.getMethod() == Method.POST) {
            return this.userService.addUser(request);
        }

        return new Response(
                HttpStatus.BAD_REQUEST,
                ContentType.JSON,
                "Ungültige Anfrage"
        );
    }
}
