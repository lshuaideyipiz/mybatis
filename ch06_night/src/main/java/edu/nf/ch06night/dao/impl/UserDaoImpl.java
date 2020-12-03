package edu.nf.ch06night.dao.impl;

import edu.nf.ch06night.dao.UserDao;
import edu.nf.ch06night.entity.Users;
import edu.nf.ch06night.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<Users> listUser(Users users) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listUser(users);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<Users> listUser2(Users users) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listUser2(users);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<Users> listUser3(Integer[] ids) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listUser3(ids);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void update(Users users) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)) {
            sqlSession.getMapper(UserDao.class).update(users);
        }catch (Exception e){
            throw e;
        }
    }
}
