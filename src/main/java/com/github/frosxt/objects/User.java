package com.github.frosxt.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
    private String name;
    private final List<String> languages;
    private final List<String> languagesToLearn;
    private String discord;

    public User() {
        languages = new ArrayList<>();
        languagesToLearn = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addLanguage(String... languageName) {
        languages.addAll(Arrays.asList(languageName));
    }

    public void addLanguageToLearn(String... languageName) {
        languagesToLearn.addAll(Arrays.asList(languageName));
    }

    public void setDiscord(String discord) {
        this.discord = discord;
    }

    public String getName() {
        return name;
    }

    public List<String> getLanguages() {
        return new ArrayList<>(languages);
    }

    public List<String> getLanguagesToLearn() {
        return new ArrayList<>(languagesToLearn);
    }

    public String getDiscord() {
        return discord;
    }
}
