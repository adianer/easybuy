package servlet;

import servies.Userservies;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Regist")
public class Regist extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        doGet(request, response);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        List<Object> objects = new ArrayList<Object>();
        //获取表单值
        objects.add(request.getParameter("loginName"));
        objects.add(request.getParameter("userName"));
        objects.add((String) request.getParameter("password"));
        objects.add(request.getParameter("mobile").toString());
        objects.add(request.getParameter("email").toString());
        objects.add(Integer.parseInt(request.getParameter("sex")));
        Userservies userservies=new Userservies();
        int i=-1;
        try {
           i=userservies.regist(objects.toArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.getOutputStream().print(i);
    }
}
