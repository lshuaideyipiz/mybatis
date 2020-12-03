package edu.nf.ch02.dao.impl;

import edu.nf.ch02.dao.UserDao;
import edu.nf.ch02.entity.Users;
import edu.nf.ch02.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class UseDaoImpl implements UserDao {

    @Override
    public void save(Users users) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).save(users);
        }catch (Exception e){
            throw e;
        }
    }
}
