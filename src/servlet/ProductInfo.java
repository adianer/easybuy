package servlet;

import pojo.ProductCategory;
import servies.ProductCategoryservies;
import servies.Productservies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ProductInfo")
public class ProductInfo extends HttpServlet {
    public static Productservies productservies;
    @Override
    public void init() throws ServletException {
        productservies=new Productservies();
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
            int id=0;
            if(request.getParameter("id")!=null) {
               id = Integer.parseInt(request.getParameter("id"));
                try {
                    productservies.querybyId(request,id);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            request.getRequestDispatcher("ProductInfo.jsp").forward(request, response);
        }else {
            PrintWriter otu=response.getWriter();
            otu.print(" <script type='text/javascript'>alert('您还未登录，即将跳转至登录页面');\n" +
                    "    window.location.href='Loginservlet.jsp'</script>");

        }
    }
}
