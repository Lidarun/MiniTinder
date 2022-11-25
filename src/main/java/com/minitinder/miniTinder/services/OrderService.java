package com.minitinder.miniTinder.services;

import com.minitinder.miniTinder.models.Orders;
import com.minitinder.miniTinder.models.Users;

import java.util.List;

public interface OrderService {
    void save(Users user, Users user2);
    //    void update(long id, Users user);
    List<Orders> findAll();
    Orders findByID(long id);
//    void delete(long id);
    void likeById(long senderId, long recipId);
    boolean checkId(long senserId, long recipId);
    List<Users> inWaiting(long senderId);
    List<Users> proposal(long senderId);
    void toAccept(int answer, long senserId, long recipId);
    List<Users> mutually(long senderId);
    List<Users> notMutually(long senderId);
}
