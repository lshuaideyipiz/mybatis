package edu.nf.ch04night.servlet;

import com.google.gson.Gson;
import edu.nf.ch04night.dao.UserDao;
import edu.nf.ch04night.dao.impl.UserDaoImpl;
import edu.nf.ch04night.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class showUsers extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.listUsers();
        String json = new Gson().toJson(list);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(json);
    }
}
