package edu.nf.ch04night.dao.impl;

import edu.nf.ch04night.dao.UserDao;
import edu.nf.ch04night.entity.Users;
import edu.nf.ch04night.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<Users> listUsers() {
        try (SqlSession sqlSession = MybatisUtil.getSqlSession(true)) {
            return sqlSession.getMapper(UserDao.class).listUsers();
        } catch (Exception e) {
            throw e;
        }
    }
}
