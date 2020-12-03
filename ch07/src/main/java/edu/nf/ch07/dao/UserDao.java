package edu.nf.ch07.dao;

import edu.nf.ch07.entity.Users;

import java.util.List;

public interface UserDao {
    /**
     * 批量添加用户
     */
    void addBatch(List<Users> list);

    void delBatch(int[] ids);
}
