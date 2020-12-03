package edu.nf.ch10Week.dao;

import edu.nf.ch10Week.entity.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityDao {
    public List<City> listCity(City city,@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
}
