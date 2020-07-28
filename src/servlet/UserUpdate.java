package servlet;

import pojo.User;
import servies.Userservies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserUpdate")
public class UserUpdate extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        System.out.println("id:"+id);
        Userservies  userservies=new Userservies();
       User user= userservies.UserGetId(Integer.valueOf(id));
        req.setAttribute("user",user);
        req.getRequestDispatcher("/UserUpdate.jsp").forward(req,resp);
    }
}
