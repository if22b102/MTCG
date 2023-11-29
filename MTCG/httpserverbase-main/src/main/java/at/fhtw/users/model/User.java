package at.fhtw.users.model;
import com.fasterxml.jackson.annotation.JsonAlias;

public class User {
    @JsonAlias({"username"})
    private String username;
    @JsonAlias({"password"})
    private String password;

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @JsonAlias({"username"})
    public String getUsername() {
        return username;
    }

    @JsonAlias({"username"})
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonAlias({"password"})
    public String getPassword() {
        return password;
    }

    @JsonAlias({"password"})
    public void setPassword(String password) {
        this.password = password;
    }
}
