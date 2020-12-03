package edu.nf.ch10Week.dao.impl;

import edu.nf.ch10Week.dao.CityDao;
import edu.nf.ch10Week.entity.City;
import edu.nf.ch10Week.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CityDaoImpl implements CityDao {
    @Override
    public List<City> listCity( City city,Integer pageNum, Integer pageSize) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
            return sqlSession.getMapper(CityDao.class).listCity(city, pageNum, pageSize);
        }catch (Exception e){
            throw e;
        }
    }
}
