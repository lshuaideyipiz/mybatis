package edu.nf.ch08.dao;

import edu.nf.ch08.entity.Student;

import java.util.List;

public interface StuDao {

    Student getStudentById(int id);

    /**
     *
     * @param id
     * @return
     */
    Student getStudentById2(int id);

    List<Student> listStu();
}
