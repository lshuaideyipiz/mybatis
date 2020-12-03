package edu.nf.ch03.test;

import edu.nf.ch03.dao.Impl.UserDaoImpl;
import edu.nf.ch03.dao.UsersDao;
import edu.nf.ch03.entity.Users;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class UsersDaoTest {

    @Test
    public void testGetUserById(){
        UsersDao dao= new UserDaoImpl();
        Users user = dao.getUserById(4);
        System.out.println(user.getUid());
        System.out.println(user.getUserName());
    }

    @Test
    public void testGetUserById2(){
        UsersDao dao = new UserDaoImpl();
        Map<String,Object> map = dao.getUserById2(4);
        map.forEach((k,v)-> System.out.println(k+":"+v));
    }

    @Test
    public void testListUser(){
        UsersDao dao = new UserDaoImpl();
        List<Users> list = dao.listUser();
        list.forEach(user-> System.out.println(user.getUserName()));
    }

    @Test
    public void testListUser2(){
        UsersDao dao = new UserDaoImpl();
        List<Map<String,Object>> list = dao.listUser2();
        list.forEach(map -> {map.forEach((k,v) -> System.out.println(k+":"+v));});
    }

}
