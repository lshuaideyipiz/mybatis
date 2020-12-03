package edu.nf.ch06night.test;

import edu.nf.ch06night.dao.UserDao;
import edu.nf.ch06night.dao.impl.UserDaoImpl;
import edu.nf.ch06night.entity.Users;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void testListUser(){
        Users users = new Users();
        users.setAge(19);
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.listUser(users);
        list.forEach(users1 -> System.out.println(users1.getUserName()));
    }
    @Test
    public void testListUser2(){
        Users users = new Users();
        users.setAge(21);
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.listUser2(users);
        list.forEach(users1 -> System.out.println(users1.getUserName()));
    }
    @Test
    public void testListUser3(){
        Integer[] ids = {1,2,3};
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.listUser3(ids);
        list.forEach(users -> System.out.println(users.getUserName()));
    }

    @Test
    public void testUpdate(){
        Users users = new Users();
        users.setUid(1);
        users.setAge(1);
        users.setTel("11111111111");
        UserDao dao = new UserDaoImpl();
        dao.update(users);
    }
}
