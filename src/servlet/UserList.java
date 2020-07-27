package servlet;

import pojo.User;
import servies.Userservies;
import util.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserList")
public class UserList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Userservies userservies=new Userservies();
            Integer pageNo= Integer.valueOf(req.getParameter("pageNo"));
          Page<User> page= userservies.Getfigall(pageNo);
          req.setAttribute("page",page);
          req.getRequestDispatcher("/UserList.jsp").forward(req,resp);
    }
}
