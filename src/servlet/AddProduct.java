package servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import servies.Productservies;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addProduct")
public class AddProduct extends HttpServlet {

    public static Productservies productservies;
    @Override
    public void init() throws ServletException {
        productservies=new Productservies();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        List<Object> objects = new ArrayList<Object>();
        objects.add(request.getParameter("categoryLevel1Id"));
        objects.add(request.getParameter("categoryLevel2Id"));
        objects.add(request.getParameter("categoryLevel3Id"));
        objects.add(request.getParameter("name"));
        objects.add(request.getParameter("photo"));
        objects.add(request.getParameter("price"));
        objects.add(request.getParameter("stock"));
        objects.add(request.getParameter("description"));
        int i=0;
        if(request.getParameter("id")!="") {
            objects.add(request.getParameter("id"));
            i=productservies.updataProduct(objects);
        }else if(request.getParameter("id")==""){
            i=productservies.inserProduct(objects,request);
        }
        PrintWriter out=response.getWriter();
        if(i>0){
            out.print("<script type='text/javascript'>alert('上架成功，3秒后将跳转至商品展示界面');"+
                    "setTimeout(location.href='/ProductManage?currentPage=1',2000);</script>");
        }else {
            out.print("<script type='text/javascript'>alert('上架失败，请核对后再操作');"+
                    "location.reload();</script>");
    }
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
            doPost(request,response);
        }
}
