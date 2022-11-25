package com.minitinder.miniTinder.services;

import com.minitinder.miniTinder.models.Gender;
import com.minitinder.miniTinder.models.Users;

import java.util.List;
import java.util.Locale;

public interface UsersService {
    void save(Users user);
//    void update(long id, Users user);
    List<Users> findAll();
    Users findByID(long id);
//    void delete(long id);

    boolean logPass(String login, String password);
    Users welcome(String login, String password);

    List<Users> findMale(Gender gender, List<Long> recipId);

    public List<Long> idUsers(long senderId);
}
