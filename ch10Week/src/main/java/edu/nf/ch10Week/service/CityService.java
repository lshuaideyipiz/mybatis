package edu.nf.ch10Week.service;

import com.github.pagehelper.PageInfo;
import edu.nf.ch10Week.dao.CityDao;
import edu.nf.ch10Week.dao.impl.CityDaoImpl;
import edu.nf.ch10Week.entity.City;

import java.util.List;

public class CityService {
    public PageInfo  <City> listCity(City city,Integer pageNum,Integer pageSize){
        CityDao dao = new CityDaoImpl();
        List<City> list = dao.listCity( city, pageNum, pageSize);
        //把查出来的结果用PageInfo对象做处理并返回
        PageInfo<City> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
