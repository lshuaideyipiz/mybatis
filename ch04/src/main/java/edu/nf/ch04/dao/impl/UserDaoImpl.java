package edu.nf.ch04.dao.impl;

import edu.nf.ch04.dao.UserDao;
import edu.nf.ch04.entity.Users;
import edu.nf.ch04.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public Users getUserById(int id) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).getUserById(id);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<Users> listUser() {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listUser();
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public int count() {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return  sqlSession.getMapper(UserDao.class).count();
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<Users> like(String likeName) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).like(likeName);
        }catch (Exception e){
            throw e;
        }
    }
}
