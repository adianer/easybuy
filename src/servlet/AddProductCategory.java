package servlet;

import servies.ProductCategoryservies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/add")
public class AddProductCategory extends HttpServlet {
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
        List<Object> objects = new ArrayList<Object>();
        objects.add(Integer.parseInt(request.getParameter("first")));
        objects.add(request.getParameter("name"));
        String parname=request.getParameter("parname");
        int i=0;
        ProductCategoryservies productCategoryservies=new ProductCategoryservies();
        i=productCategoryservies.add(objects, parname);;
        response.getOutputStream().print(i);
    }
}
