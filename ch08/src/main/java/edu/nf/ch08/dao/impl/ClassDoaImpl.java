package edu.nf.ch08.dao.impl;

import edu.nf.ch08.dao.ClassDao;
import edu.nf.ch08.entity.ClassInfo;
import edu.nf.ch08.uitl.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class ClassDoaImpl implements ClassDao {
    @Override
    public ClassInfo getClassById(int id) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(ClassDao.class).getClassById(id);
        }catch (Exception e){
            throw e;
        }
    }
}
