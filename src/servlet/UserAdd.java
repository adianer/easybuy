package servlet;

import pojo.User;
import servies.Userservies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserAdd")
public class UserAdd  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String loginName = req.getParameter("loginName");
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String identity = req.getParameter("identityCode");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        String type = req.getParameter("type");
        System.out.println("type:"+type);
        User user=new User();
        user.setLoginName(loginName);
        user.setUserName(userName);
        user.setPassword(password);
        user.setIdentityCode(identity);
        user.setEmail(email);
        user.setMobile(mobile);
        user.setType(Integer.valueOf(type));

        Userservies userservies=new Userservies();
        Integer i=  userservies.UaerAdd(user);
        System.out.println(i);
        if (i>0){
            req.getRequestDispatcher("/UserList?pageNo=1").forward(req,resp);
        }else {
            resp.sendRedirect("/UserAdd.jsp");
        }
    }
}
