package edu.nf.ch06.dao.impl;

import edu.nf.ch06.dao.UserDao;
import edu.nf.ch06.entity.Users;
import edu.nf.ch06.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<Users> listUsers(Users users) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)) {
            return sqlSession.getMapper(UserDao.class).listUsers(users);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<Users> listUsers2(Users users) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)) {
            return sqlSession.getMapper(UserDao.class).listUsers2(users);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<Users> listUsers3(Integer[] uids) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)) {
            return sqlSession.getMapper(UserDao.class).listUsers3(uids);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void update(Users users) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)) {
            sqlSession.getMapper(UserDao.class).update(users);
        }catch (Exception e){
            throw e;
        }
    }
}
