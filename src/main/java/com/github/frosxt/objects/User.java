package com.github.frosxt.objects;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class User {
    private final String username;
    private final String country;
    private final String discord;
    private final Set<String> languages = new HashSet<>();

    public User(final String username, final String country, final String discord, final String... languages) {
        this.username = username;
        this.country = country;
        this.discord = discord;
        this.languages.addAll(Arrays.asList(languages));
    }

    public String getUsername() {
        return this.username;
    }

    public String getCountry() {
        return this.country;
    }

    public String getDiscord() {
        return this.discord;
    }

    public Set<String> getLanguages() {
        return this.languages;
    }
}