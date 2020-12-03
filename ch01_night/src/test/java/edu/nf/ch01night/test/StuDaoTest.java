package edu.nf.ch01night.test;

import edu.nf.ch01night.dao.StuDao;
import edu.nf.ch01night.dao.impl.StuDaoImpl;
import edu.nf.ch01night.entity.Student;
import edu.nf.ch01night.util.UUIDUtils;
import org.junit.Test;

public class StuDaoTest {

    @Test
    public void saveTest(){
        Student student = new Student();
        student.setStuId("aaa");
        student.setStuName("aaaName");
        StuDao dao = new StuDaoImpl();
        dao.save(student);
    }

    @Test
    public void save2Test(){
        Student student = new Student();
        student.setStuName("lizhi");
        StuDao dao = new StuDaoImpl();
        dao.save2(student);
    }
    @Test
    public void save3Test(){
        Student student = new Student();
        student.setStuId(UUIDUtils.createUUID());
        student.setStuName("MyUUID");
        StuDao dao = new StuDaoImpl();
        dao.save3(student);
    }

}
