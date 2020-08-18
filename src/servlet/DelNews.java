package servlet;


import servies.Newsservies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delnews")

public class DelNews extends HttpServlet {
    public static Newsservies newsservies;
    @Override
    public void init() throws ServletException {
        newsservies=new Newsservies();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        doGet(request, response);
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        request.setCharacterEncoding("utf-8");
        int id=Integer.parseInt(request.getParameter("delid"));
        int i=newsservies.delbyId(id);
        response.getOutputStream().print(i);
    }
}

