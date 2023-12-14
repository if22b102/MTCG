package at.fhtw.mtcg.model;

import java.util.UUID;

public class TradingDeal {
    private UUID dealId;
    private String offeredCardId;
    private String cardTypeRequired; // "monster" oder "spell"
    private float minimumDamageRequired;
    private String ownerId; // Der Benutzer, der den Handelsdeal erstellt hat

    // Konstruktor
    public TradingDeal(UUID dealId, String offeredCardId, String cardTypeRequired, float minimumDamageRequired, String ownerId) {
        this.dealId = dealId;
        this.offeredCardId = offeredCardId;
        this.cardTypeRequired = cardTypeRequired;
        this.minimumDamageRequired = minimumDamageRequired;
        this.ownerId = ownerId;
    }

    // Getter und Setter
    public UUID getDealId() {
        return dealId;
    }

    public void setDealId(UUID dealId) {
        this.dealId = dealId;
    }

    public String getOfferedCardId() {
        return offeredCardId;
    }

    public void setOfferedCardId(String offeredCardId) {
        this.offeredCardId = offeredCardId;
    }

    public String getCardTypeRequired() {
        return cardTypeRequired;
    }

    public void setCardTypeRequired(String cardTypeRequired) {
        this.cardTypeRequired = cardTypeRequired;
    }

    public float getMinimumDamageRequired() {
        return minimumDamageRequired;
    }

    public void setMinimumDamageRequired(float minimumDamageRequired) {
        this.minimumDamageRequired = minimumDamageRequired;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    // Weitere Methoden können je nach Anforderung hinzugefügt werden
}
