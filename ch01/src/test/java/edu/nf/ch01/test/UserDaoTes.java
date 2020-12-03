package edu.nf.ch01.test;

import edu.nf.ch01.dao.UserDao;
import edu.nf.ch01.dao.impl.UserDaoImpl;
import edu.nf.ch01.entity.Users;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UserDaoTes {
    @Test
    public void testSave(){
        Users user = new Users();
        user.setUserName("user1");
        UserDao userDao = new UserDaoImpl();
        userDao.save(user);
    }
    @Test
    public void testUpdate(){
        Users user = new Users();
        user.setUid(1);
        user.setUserName("NewUser");
        UserDao userDao = new UserDaoImpl();
        userDao.update(user);
    }
    @Test
    public void testDelete(){
        UserDao userDao = new UserDaoImpl();
        userDao.delete(3);
    }
    @Test
    public void testUpdate2(){
        UserDao userDao = new UserDaoImpl();
        userDao.update2("a",2);
    }

    @Test
    public void testSave2(){
        Map<String,Object> map = new HashMap<>();
        map.put("uName","张三");
        UserDao userDao = new UserDaoImpl();
        userDao.save2(map);
    }

    @Test
    public void testSave3(){
        Map<String,Object> map = new HashMap<>();
        Users users = new Users();
        users.setUserName("张三");
        map.put("uName",users);
        UserDao userDao = new UserDaoImpl();
    }
}
