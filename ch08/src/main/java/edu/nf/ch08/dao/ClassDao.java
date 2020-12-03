package edu.nf.ch08.dao;

import edu.nf.ch08.entity.ClassInfo;

public interface ClassDao {

    /**
     * 根据id查班级
     * @param id
     * @return
     */
    ClassInfo getClassById(int id);

}
