package edu.nf.ch01.dao;

import edu.nf.ch01.entity.Users;

import java.util.Map;

public interface UserDao {
    /**
     * 更新用户
     * @param user
     */
    void save(Users user);

    void save2(Map<String,Object> map);

    /**
     * 修改用户
     * @param user
     */
    void update(Users user);

    /**
     * 三处用户
     * @param uid
     */
    void delete(int uid);

    void update2(String userName,int uid);
}
