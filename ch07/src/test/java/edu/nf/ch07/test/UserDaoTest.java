package edu.nf.ch07.test;

import edu.nf.ch07.dao.UserDao;
import edu.nf.ch07.dao.impl.UserDaoImpl;
import edu.nf.ch07.entity.Users;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserDaoTest {
    @Test
    public void testAddBatch(){
        List<Users> list = new ArrayList<>();
        Users user = new Users("li",18,"77777777777");
        Users user1 = new Users("liang",17,"77777777777");
        list.add(user);
        list.add(user1);
        UserDao dao = new UserDaoImpl();
        dao.addBatch(list);
    }

    @Test
    public void testDelVBatch(){
        int[] ids = {4,5};
        UserDao dao = new UserDaoImpl();
        dao.delBatch(ids);
    }
}
