package com.github.frosxt.users;

import com.github.frosxt.managers.UserManager;
import com.github.frosxt.objects.User;

public class Frost extends User {
    public Frost() {
        super("frost", "Scotland", "frost#0723", "Java");

        UserManager.addUser(this);
    }
}