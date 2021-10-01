package com.github.frosxt.managers;

import com.github.frosxt.objects.User;

import java.util.HashSet;
import java.util.Set;

public class UserManager {
    private static final Set<User> USERS = new HashSet<>();

    private UserManager() {
        // This class should not be initialised
    }

    public static void addUser(User user) {
        USERS.add(user);
    }

    public static Set<User> getUsers() {
        return new HashSet<>(USERS);
    }
}
