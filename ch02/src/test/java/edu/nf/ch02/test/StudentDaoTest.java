package edu.nf.ch02.test;

import edu.nf.ch02.dao.StuDao;
import edu.nf.ch02.dao.impl.StuDaoImpl;
import edu.nf.ch02.entity.Student;
import edu.nf.ch02.entity.Users;
import edu.nf.ch02.util.UUIDUtils;
import org.junit.Test;

public class StudentDaoTest {

    @Test
    public void saveTest(){
        Student student = new Student();
        student.setStuName("user1");

        StuDao stuDao = new StuDaoImpl();
        stuDao.save(student);
        System.out.println(student.getStuId());
        System.out.println(student.getStuName());
    }
    @Test
    public void testSave2(){
        Student stu = new Student();
        stu.setStuId(UUIDUtils.createUUID());
        stu.setStuName("user3");
        StuDao dao = new StuDaoImpl();
        dao.save(stu);
    }
}
