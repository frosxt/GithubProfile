package com.github.frosxt;

import com.github.frosxt.managers.UserManager;
import com.github.frosxt.objects.User;

public class GithubProfile {

    public static void main(String[] args) {
        initialiseUser();

        UserManager.getUsers().forEach(user ->
                System.out.printf("Name: %s %nLanguages: %s %nLanguages to Learn: %s %nDiscord: %s",
                        user.getName(), user.getLanguages().toString(), user.getLanguagesToLearn().toString(), user.getDiscord()));
    }

    private static void initialiseUser() {
        User user = new User();
        user.setName("frost");
        user.addLanguage("Java");
        user.addLanguageToLearn("Python", "Kotlin", "Ruby", "JavaScript", "HTML", "CSS");
        user.setDiscord("frost#0723");

        UserManager.addUser(user);
    }
}