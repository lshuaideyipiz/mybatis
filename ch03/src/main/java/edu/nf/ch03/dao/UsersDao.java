package edu.nf.ch03.dao;

import edu.nf.ch03.entity.Users;

import java.util.List;
import java.util.Map;

public interface UsersDao {

    Users getUserById(int uid);

    Map<String,Object> getUserById2(int uid);

    List<Users> listUser();

    List<Map<String,Object>> listUser2();
}
