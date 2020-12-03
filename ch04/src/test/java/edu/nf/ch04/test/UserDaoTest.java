package edu.nf.ch04.test;

import edu.nf.ch04.dao.UserDao;
import edu.nf.ch04.dao.impl.UserDaoImpl;
import edu.nf.ch04.entity.Users;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void testGetUSerById(){
        UserDao dao = new UserDaoImpl();
        Users users =dao.getUserById(4);
        System.out.println(users.getUserName());
    }

    @Test
    public void testListUser(){
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.listUser();
        list.forEach(user -> System.out.println(user.getUserName()));
    }
    @Test
    public void testCount(){
        UserDao dao = new UserDaoImpl();
        int count = dao.count();
        System.out.println(count);
    }

    @Test
    public void testLike(){
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.like("l");
        list.forEach(users -> System.out.println(users.getUserName()));
    }

}
