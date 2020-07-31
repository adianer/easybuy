package servlet;


import com.alibaba.fastjson.JSON;
import pojo.ProductCategory;
import servies.ProductCategoryservies;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Classify")
public class Classify extends HttpServlet {
    public static ProductCategoryservies productCategoryservies;
    @Override
    public void init() throws ServletException {
        productCategoryservies=new ProductCategoryservies();
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
        request.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        List<ProductCategory> list = new ArrayList<ProductCategory>();
        int parid=Integer.parseInt(request.getParameter("id"));
        list=productCategoryservies.getClassify(request,parid);
       response.getWriter().print(JSON.toJSONString(list));

    }
}
