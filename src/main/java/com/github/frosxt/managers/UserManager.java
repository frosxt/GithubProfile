package com.github.frosxt.managers;

import com.github.frosxt.objects.User;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private static final Map<String, User> USERS = new HashMap<>();

    private UserManager() {
        // This class should not be initialised
    }

    public static void addUser(final User user) {
        USERS.put(user.getUsername(), user);
    }

    public static Map<String, User> getUsers() {
        return new HashMap<>(USERS);
    }
}
