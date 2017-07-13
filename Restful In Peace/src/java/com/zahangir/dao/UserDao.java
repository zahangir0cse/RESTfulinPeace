/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahangir.dao;

import com.zahangir.model.User;
import java.util.List;

/**
 *
 * @author Zahangir Alam
 */
public interface UserDao {
    public void addUser(User user);
    public List<User> userList();
    public void removeUser(Integer userId);
    public void updateUser(User user);
    public List<User> getUserByEmail(String email);
}