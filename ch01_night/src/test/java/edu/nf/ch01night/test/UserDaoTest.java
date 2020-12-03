package edu.nf.ch01night.test;

import edu.nf.ch01night.dao.UserDao;
import edu.nf.ch01night.dao.impl.UserDaoimpl;
import edu.nf.ch01night.entity.User;
import org.junit.Test;

import java.awt.font.TextAttribute;

public class UserDaoTest {
    
    @Test
    public void saveTest(){
        User user = new User();
        user.setUserName("lisa");
        UserDao dao = new UserDaoimpl();
        dao.save(user);
        System.out.println("id,"+user.getUid());
    }

    @Test
    public void save2Test(){
        User user = new User();
        user.setUserName("lishang");
        UserDao dao = new UserDaoimpl();
        dao.save2(user);
        System.out.println(user.getUid());
    }

}
