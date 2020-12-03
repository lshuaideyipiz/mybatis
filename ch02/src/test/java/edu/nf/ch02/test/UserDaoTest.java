package edu.nf.ch02.test;

import edu.nf.ch02.dao.UserDao;
import edu.nf.ch02.dao.impl.UseDaoImpl;
import edu.nf.ch02.entity.Users;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testSave(){
        Users users = new Users();
        users.setUserName("list");
        UserDao userDao = new UseDaoImpl();
        userDao.save(users);
        System.out.printf(users.getUid().toString());
        System.out.println(users.getUserName());
    }
}
