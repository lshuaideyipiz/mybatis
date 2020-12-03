package edu.nf.ch04.dao;

import edu.nf.ch04.entity.Users;

import java.util.List;

public interface UserDao {

    Users getUserById(int id);

    List<Users> listUser();

    int count();

    List<Users> like(String likeName);

}
