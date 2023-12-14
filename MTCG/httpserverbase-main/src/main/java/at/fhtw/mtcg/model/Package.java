package at.fhtw.mtcg.model;

import java.util.ArrayList;
import java.util.List;

public class Package {
    private String id; // Kann UUID oder ein anderer eindeutiger Identifikator sein
    private List<Card> cards;

    // Konstruktor
    public Package(String id) {
        this.id = id;
        this.cards = new ArrayList<>();
    }

    // Getter und Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    // Methode zum Hinzufügen einer Karte
    public void addCard(Card card) {
        this.cards.add(card);
    }

    // Methode zum Entfernen einer Karte
    public boolean removeCard(Card card) {
        return this.cards.remove(card);
    }

    // Weitere Methoden können je nach Anforderung hinzugefügt werden
}
