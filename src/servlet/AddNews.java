package servlet;

import pojo.User;
import servies.Newsservies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet("/addnews")
public class AddNews extends HttpServlet {

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
        List<Object> objects = new ArrayList<Object>();
        objects.add(request.getParameter("title"));
        objects.add(request.getParameter("content"));
        Date data=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        objects.add(format.format(data));
        User user=(User) request.getSession().getAttribute("user");
        objects.add(user.getLoginName());
        int i=0;
        if(request.getParameter("id")!=null) {
            objects.add(request.getParameter("id"));
            i=newsservies.updataNews(objects);
        }else {
            i=newsservies.inserNews(objects);
        }
        PrintWriter out=response.getWriter();
        if(i>0){
            out.print("<script type='text/javascript'>alert('操作成功，即将跳转至新闻列表');"+
                    "setTimeout(location.href='/News?currentPage=1',1000);</script>");
        }else {
            out.print("<script type='text/javascript'>alert('操作失败，请核对后再操作');"+
                    "location.reload();</script>");
    }
}
}
