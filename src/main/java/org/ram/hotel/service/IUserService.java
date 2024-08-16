package org.ram.hotel.service;

import java.util.List;

import org.ram.hotel.model.User;

/**
 * @author  Ram
 */

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
