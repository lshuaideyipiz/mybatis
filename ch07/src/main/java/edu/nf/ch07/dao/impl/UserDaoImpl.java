package edu.nf.ch07.dao.impl;

import edu.nf.ch07.dao.UserDao;
import edu.nf.ch07.entity.Users;
import edu.nf.ch07.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public void addBatch(List<Users> list) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).addBatch(list);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void delBatch(int[] ids) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).delBatch(ids);
        }catch (Exception e){
            throw e;
        }
    }
}
