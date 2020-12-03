package edu.nf.ch06.dao;

import edu.nf.ch06.entity.Users;

import java.util.List;

public interface UserDao {
    /**
     * 动态条件查询（动态拼接条件）
     * @param users
     * @return
     */
    List<Users> listUsers(Users users);

    /**
     * 多选一
     * @param users
     * @return
     */
    List<Users> listUsers2(Users users);

    /**
     * 动态的条件范围查询
     * @param uids
     * @return
     */
    List<Users> listUsers3(Integer[] uids);

    /**
     * 动态更新字段
     * @param users
     */
    void update(Users users);
}
