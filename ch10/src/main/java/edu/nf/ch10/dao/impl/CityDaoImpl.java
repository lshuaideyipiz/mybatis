package edu.nf.ch10.dao.impl;

import edu.nf.ch10.dao.CityDao;
import edu.nf.ch10.entity.City;
import edu.nf.ch10.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author wangl
 * @date 2020/11/13
 */
public class CityDaoImpl implements CityDao {

    @Override
    public List<City> listCity(Integer pageNum, Integer pageSize) {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession(true)) {
            return sqlSession.getMapper(CityDao.class).listCity(pageNum, pageSize);
        }catch(RuntimeException e){
            throw e;
        }
    }
}
