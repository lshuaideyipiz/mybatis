package edu.nf.ch.test;

import edu.nf.ch06.dao.UserDao;
import edu.nf.ch06.dao.impl.UserDaoImpl;
import edu.nf.ch06.entity.Users;
import org.junit.Test;

import javax.jnlp.ClipboardService;
import javax.swing.*;
import java.util.List;

public class UserDaoTest {
    @Test
    public void listUserTest(){
        Users users = new Users();
        users.setAge(18);
        UserDao dao = new UserDaoImpl();
        dao.listUsers(users);
        List<Users> list = dao.listUsers(users);
        list.forEach(users1 -> System.out.println(users1.getUserName()));
    }

    @Test
    public void listUserTest2(){
        Users users = new Users();
        users.setAge(21);
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.listUsers2(users);
        list.forEach(users1 -> System.out.println(users1.getUserName()));
    }
    @Test
    public void testListUsers3(){
        Integer[] uids = {1,2,3};
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.listUsers3(uids);
        list.forEach(users -> System.out.println(users.getUserName()));
    }
    @Test
    public void testUpdate(){
        Users users = new Users();
        users.setUid(1);
        users.setAge(0);
        users.setTel("10000000000");
        UserDao dao = new UserDaoImpl();
        dao.update(users);
    }

}
