package edu.nf.ch10.test;

import com.github.pagehelper.PageInfo;
import edu.nf.ch10.entity.City;
import edu.nf.ch10.service.CityService;
import org.junit.Test;

import java.util.List;

/**
 * @author wangl
 * @date 2020/11/13
 */
public class CityServiceTest {

    @Test
    public void testListCity(){
        CityService service = new CityService();
        PageInfo<City> pageInfo = service.listCity(1, 10);
        System.out.println("每页记录数：" + pageInfo.getPageSize());
        System.out.println("当前页：" + pageInfo.getPageNum());
        System.out.println("首页：" + pageInfo.getNavigateFirstPage());
        System.out.println("上一页：" + pageInfo.getPrePage());
        System.out.println("下一页：" + pageInfo.getNextPage());
        System.out.println("尾页：" + pageInfo.getPages());
        System.out.println("总页数：" + pageInfo.getPages());
        System.out.println("总记录数：" + pageInfo.getTotal());
        //分页数据
        List<City> list = pageInfo.getList();
        list.forEach(city -> System.out.println(city.getName()));
    }
}
