package edu.nf.ch06night.dao;

import edu.nf.ch06night.entity.Users;

import java.util.List;

public interface UserDao {

     List<Users> listUser(Users users);

     List<Users> listUser2(Users users);

     List<Users> listUser3(Integer[] ids);

     void update(Users users);
}
