package com.github.frosxt;

import com.github.frosxt.managers.UserManager;
import com.github.frosxt.users.Frost;

public class GithubProfile {

    public static void main(final String[] args) {
        new Frost();

        UserManager.getUsers().forEach((username, user) ->
                System.out.printf("Username: %s | Country: %s | Discord: %s | Languages: %s", username, user.getCountry(), user.getDiscord(), user.getLanguages().toString()));
    }
}