package edu.nf.ch08.test;

import edu.nf.ch08.dao.StuDao;
import edu.nf.ch08.dao.impl.StuDaoImpl;
import edu.nf.ch08.entity.Student;
import org.junit.Test;

import java.util.List;

public class StuDaoTest {

    @Test
    public void testGetStudentById(){
        StuDao dao = new StuDaoImpl();
        Student stu = dao.getStudentById(1);
        System.out.println(stu.getStuName());
        System.out.println(stu.getIdCard().getCardNum());
        System.out.println(stu.getClassInfo().getClassName());
    }

    @Test
    public void testGetStudentById2(){
        StuDao dao = new StuDaoImpl();
        Student student = dao.getStudentById2(1);
        System.out.println(student.getStuName());
        student.getSubjects().forEach(sub -> System.out.println(sub.getSubName()));
    }

    @Test
    public void testListStu(){
        StuDao dao = new StuDaoImpl();
        List<Student> list = dao.listStu();
        list.forEach(stu -> System.out.println(stu.getStuName()));
    }

}
