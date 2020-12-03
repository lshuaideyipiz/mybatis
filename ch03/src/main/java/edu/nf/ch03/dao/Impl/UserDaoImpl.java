package edu.nf.ch03.dao.Impl;

import edu.nf.ch03.dao.UsersDao;
import edu.nf.ch03.entity.Users;
import edu.nf.ch03.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UsersDao {
    @Override
    public Users getUserById(int uid) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UsersDao dao = sqlSession.getMapper(UsersDao.class);
            return dao.getUserById(uid);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Map<String, Object> getUserById2(int uid) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UsersDao dao = sqlSession.getMapper(UsersDao.class);
            return dao.getUserById2(uid);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<Users> listUser() {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UsersDao dao = sqlSession.getMapper(UsersDao.class);
            return dao.listUser();
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<Map<String, Object>> listUser2() {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UsersDao dao = sqlSession.getMapper(UsersDao.class);
            return dao.listUser2();
        }catch (Exception e){
            throw e;
        }
    }
}
