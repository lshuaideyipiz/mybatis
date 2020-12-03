package edu.nf.ch01night.dao.impl;

import edu.nf.ch01night.dao.UserDao;
import edu.nf.ch01night.entity.User;
import edu.nf.ch01night.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class UserDaoimpl implements UserDao {

    @Override
    public void save(User user) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            //通过getMapper方法返回一个UserDao的代理实现类
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            //调用代理对象的save方法保存（就是UsersMapper.xml配置文件里面配置的save方法）
            userDao.save(user);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void save2(User user) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UserDao dao = sqlSession.getMapper(UserDao.class);
            dao.save2(user);
        }catch (Exception e){
            throw e;
        }
    }
}
