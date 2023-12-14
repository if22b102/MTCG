package at.fhtw.mtcg.model;

import java.time.LocalDateTime;

public class Transaction {
    private String id; // Kann UUID oder ein anderer eindeutiger Identifikator sein
    private String userId;
    private String packageId;
    private LocalDateTime timestamp;
    private boolean successful;

    // Konstruktor
    public Transaction(String id, String userId, String packageId, LocalDateTime timestamp, boolean successful) {
        this.id = id;
        this.userId = userId;
        this.packageId = packageId;
        this.timestamp = timestamp;
        this.successful = successful;
    }

    // Getter und Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    // Weitere Methoden können je nach Anforderung hinzugefügt werden
}
