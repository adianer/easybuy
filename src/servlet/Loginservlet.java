package servlet;

import servies.Userservies;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Login")
public class Loginservlet extends HttpServlet {
    public static   Userservies userservies;
    @Override
    public void init() throws ServletException {
        userservies=new Userservies();;
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        doGet(request, response);
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        String loginName=request.getParameter("loginName");
        String password=request.getParameter("password");
        int i=userservies.isenter(request,loginName,password);
        response.getOutputStream().print(i);
    }
}