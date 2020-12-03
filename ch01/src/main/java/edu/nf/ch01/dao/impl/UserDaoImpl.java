package edu.nf.ch01.dao.impl;

import edu.nf.ch01.dao.UserDao;
import edu.nf.ch01.entity.Users;
import edu.nf.ch01.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

public class UserDaoImpl implements UserDao {
    @Override
    public void save(Users user) {
        //获取SqlSession对象，并设置为true，表示自动提交事务
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            //通过getMapper方法返回一个UserDao的代理实现类
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            //调用代理对象的save方法保存（就是UsersMapper.xml配置文件里面配置的save方法）
            userDao.save(user);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void update(Users user) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            userDao.update(user);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void delete(int uid) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            userDao.delete(uid);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void update2(String userName, int uid) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            userDao.update2(userName,uid);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void save2(Map<String, Object> map) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            //通过getMapper方法返回一个UserDao的代理实现类
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            //调用代理对象的save方法保存（就是UsersMapper.xml配置文件里面配置的save方法）
            userDao.save2(map);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
