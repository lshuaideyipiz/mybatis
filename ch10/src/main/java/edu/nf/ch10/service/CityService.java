package edu.nf.ch10.service;

import com.github.pagehelper.PageInfo;
import edu.nf.ch10.dao.CityDao;
import edu.nf.ch10.dao.impl.CityDaoImpl;
import edu.nf.ch10.entity.City;

import java.util.List;

/**
 * @author wangl
 * @date 2020/11/13
 */
public class CityService {

    /**
     * 查询分页数据，并封装成PageInfo对象
     * PageInfo这个类包含许多分页参数的信息，提供给页面访问。
     * 例如：当前页、总页数、中记录数、起始页、尾页等等
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<City> listCity(Integer pageNum, Integer pageSize){
        CityDao dao = new CityDaoImpl();
        //查询分页记录
        List<City> list = dao.listCity(pageNum, pageSize);
        //将list封装到PageInfo对象中并返回
        PageInfo<City> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
