package net.tkalin.mytrelloapp.service;

import net.tkalin.mytrelloapp.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String userName);
}
