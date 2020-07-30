package servlet;

import com.alibaba.fastjson.JSON;
import servies.Userservies;
import util.JsonData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UserDelete")
public class UserDelete extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        Userservies userservies=new Userservies();
       Integer id= Integer.valueOf(req.getParameter("id"));
           Integer i=  userservies.deleteUser(id);
        System.out.println(i);
        JsonData jsonData = new JsonData();
           if (i>0){

               jsonData.setId(1);

           }else {
               jsonData.setMessage("删除失败");
           }
        PrintWriter out = resp.getWriter();
        out.print(JSON.toJSONString(jsonData));
        out.flush();
        out.close();
    }
}
