package edu.nf.ch02.dao.impl;

import edu.nf.ch02.dao.StuDao;
import edu.nf.ch02.entity.Student;
import edu.nf.ch02.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class StuDaoImpl implements StuDao {
    @Override
    public void save(Student student) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(StuDao.class).save(student);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void save2(Student student) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(StuDao.class).save2(student);
        }catch (Exception e){
            throw e;
        }
    }
}
