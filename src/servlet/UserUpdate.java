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
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        Userservies userservies=new Userservies();
        User user=new User();
        user.setLoginName(req.getParameter("loginName"));
        user.setUserName(req.getParameter("userName"));
        user.setIdentityCode(req.getParameter("identityCode"));
        user.setEmail(req.getParameter("email"));
        user.setMobile(req.getParameter("mobile"));
        user.setType(Integer.valueOf(req.getParameter("type")));
           Integer i =   userservies.Userupdate(user);
        if (i>0){
            req.getRequestDispatcher("/UserList?pageNo=1").forward(req,resp);
        }
        else {
            System.out.println("修改失败！！！");
        }
    }
}
