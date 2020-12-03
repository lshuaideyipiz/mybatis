package edu.nf.ch10Week.controller;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import edu.nf.ch10Week.entity.City;
import edu.nf.ch10Week.service.CityService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/listCityServlet")
public class CityServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer pageNum = Integer.valueOf(req.getParameter("pageNum"));
        Integer pageSize = Integer.valueOf(req.getParameter("pageSize"));
        String province = req.getParameter("province");
        City city = new City();
        city.setProvince(province);
        //创建业务层对象
        CityService service = new CityService();
        //查询并返回PageInfo对象
        PageInfo<City> pageInfo = service.listCity( city,pageNum, pageSize);
        //将PageInfo对象序列为json字符串
        String json = new Gson().toJson(pageInfo);
        //将json响应客户端
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(json);
    }
}
