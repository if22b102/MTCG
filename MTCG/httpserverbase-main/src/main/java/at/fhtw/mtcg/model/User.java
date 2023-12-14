package at.fhtw.mtcg.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String token;
    private String bio;
    private String image;
    private List<Card> cards;
    private int wins;
    private int losses;

    // Konstruktor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.cards = new ArrayList<>();
        // Initialisieren Sie wins, losses und andere Felder bei Bedarf
    }

    // Getter und Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Card> getCards() {
        return cards;
    }

    // Kartenmanagement
    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    // Statistiken aktualisieren
    public void incrementWins() {
        wins++;
    }

    public void incrementLosses() {
        losses++;
    }

    // Weitere Methoden können je nach Anforderung hinzugefügt werden
}
