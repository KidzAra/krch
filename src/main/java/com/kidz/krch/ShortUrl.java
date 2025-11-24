package com.kidz.krch;

import jakarta.persistence.*;

@Entity
public class ShortUrl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    public String originalUrl;

    @Column(nullable = false, unique = true)
    private String shortCode;

    public String getOriginalUrl() {
        return this.originalUrl;
    }

    public String getShortCode() {
        return shortCode;
    }

    public ShortUrl() {}

    public ShortUrl(String originalUrl, String shortCode) {
        this.originalUrl = originalUrl;
        this.shortCode = shortCode;
    }
}
