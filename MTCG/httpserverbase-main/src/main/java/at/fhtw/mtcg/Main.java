package at.fhtw.mtcg;

import at.fhtw.mtcg.httpserver.server.Server;
import at.fhtw.httpserver.utils.Router;
import at.fhtw.sampleapp.controller.EchoController;
import at.fhtw.sampleapp.controller.WeatherController;
import at.fhtw.users.controller.UserController;

import java.io.IOException;

import static sun.net.www.protocol.http.AuthCacheValue.Type.Server;

public class Main {
    public static void main(String[] args) {
        Server server = new Server(10001, configureRouter());
        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Router configureRouter()
    {
        Router router = new Router();
        router.addService("/weather", new WeatherController());
        router.addService("/echo", new EchoController());
        router.addService("/users", new UserController());

        return router;
    }
}
