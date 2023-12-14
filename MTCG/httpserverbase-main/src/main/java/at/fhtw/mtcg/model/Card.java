package at.fhtw.mtcg.model;

public class Card {
    private String id;      // Kann UUID oder ein anderer eindeutiger Identifikator sein
    private String name;
    private double damage;
    private CardType cardType;

    // Enum für CardType
    public enum CardType {
        MONSTER,
        SPELL
    }

    // Konstruktor
    public Card(String id, String name, double damage, CardType cardType) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.cardType = cardType;
    }

    // Getter und Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    // Weitere Methoden können je nach Anforderung hinzugefügt werden
}
