package edu.nf.ch08.test;

import edu.nf.ch08.dao.ClassDao;
import edu.nf.ch08.dao.impl.ClassDoaImpl;
import edu.nf.ch08.entity.ClassInfo;
import org.junit.Test;

public class ClassDaoTest {

    @Test
    public void testGetClassById(){
        ClassDao dao = new ClassDoaImpl();
        ClassInfo info = dao.getClassById(1);
        System.out.println(info.getClassName());
        info.getStudents().forEach(stu -> System.out.println(stu.getStuName()));
    }
}
