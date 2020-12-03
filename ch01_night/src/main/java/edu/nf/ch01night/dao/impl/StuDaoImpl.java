package edu.nf.ch01night.dao.impl;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import edu.nf.ch01night.dao.StuDao;
import edu.nf.ch01night.entity.Student;
import edu.nf.ch01night.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class StuDaoImpl implements StuDao {
    @Override
    public void save(Student student) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            //通过sqlSession返回一个代理实现类（临时在内存里面的），代理实现类去Mapper里面找对应设置的方法调用执行
            StuDao dao = sqlSession.getMapper(StuDao.class);
            dao.save(student);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void save2(Student student) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            StuDao dao = sqlSession.getMapper(StuDao.class);
            dao.save2(student);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void save3(Student student) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            StuDao dao = sqlSession.getMapper(StuDao.class);
            dao.save3(student);
        }catch (Exception e){
            throw e;
        }
    }


}
