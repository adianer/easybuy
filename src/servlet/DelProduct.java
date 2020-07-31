package servlet;

import servies.Productservies;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delproduct")
public class DelProduct extends HttpServlet {
    public static Productservies productservies;
    @Override
    public void init() throws ServletException {
        productservies=new Productservies();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        doGet(request, response);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        int id=Integer.parseInt(request.getParameter("delid"));
        int i=productservies.deletebyId(id);
        response.getOutputStream().print(i);
    }
}