package servlet;

import servies.Newsservies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Newslist")
public class NewsList extends HttpServlet {
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
        if (request.getSession().getAttribute("user")!=null){
            int num=1;
            if(request.getParameter("currentPage")!=null) {
                num = Integer.parseInt(request.getParameter("currentPage"));
            }
            try {
                newsservies.getshowlist(request,num);
            } catch (Exception e) {
                e.printStackTrace();
            }
            request.getRequestDispatcher("News.jsp").forward(request, response);
        }else {
            PrintWriter otu=response.getWriter();
            otu.print(" <script type='text/javascript'>alert('您还未登录，即将跳转至登录页面');\n" +
                    "    window.location.href='/EasybuyLogin'</script>");

        }
    }
}
