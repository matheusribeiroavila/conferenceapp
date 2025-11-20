package br.com.avilaconference.confratern.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_subscription")
public class Subscription {
    @Id
    @Column(name = "subscription_id")
    private SubscriptionID id;
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    public SubscriptionID getId() {
        return id;
    }

    public void setId(SubscriptionID id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
