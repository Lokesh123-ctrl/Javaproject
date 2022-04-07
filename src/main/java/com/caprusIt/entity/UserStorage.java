package com.caprusIt.entity;

import java.util.ArrayList;

import java.util.List;

public class UserStorage {
	

    private static UserStorage instance;
    private List<String> users;

    private UserStorage() {
        users = new ArrayList<>();
    }

    public static synchronized UserStorage getInstance() {
        if (instance == null) {
            instance = new UserStorage();
        }
        return instance;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUser(String userName) throws Exception {
        if (users.contains(userName)) {
            throw new Exception("User aready exists with userName: " + userName);
        }
        users.add(userName);
    }
}


