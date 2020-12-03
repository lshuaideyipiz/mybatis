package edu.nf.ch08.dao.impl;

import edu.nf.ch08.dao.StuDao;
import edu.nf.ch08.entity.Student;
import edu.nf.ch08.uitl.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StuDaoImpl implements StuDao {
    @Override
    public Student getStudentById(int id) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(StuDao.class).getStudentById(id);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Student getStudentById2(int id) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(StuDao.class).getStudentById2(id);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<Student> listStu() {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(StuDao.class).listStu();
        }catch (Exception e){
            throw e;
        }
    }
}
