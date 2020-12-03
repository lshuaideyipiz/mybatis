package edu.nf.ch04.service;

import com.google.gson.Gson;
import edu.nf.ch04.dao.UserDao;
import edu.nf.ch04.dao.impl.UserDaoImpl;
import edu.nf.ch04.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/showList")
public class ShowUsersServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.listUser();
        String json = new Gson().toJson(list);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(json);
    }
}
