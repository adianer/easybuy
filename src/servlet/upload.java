package servlet;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
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
import java.util.Iterator;
import java.util.List;

@WebServlet("/upload")
public class upload extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        boolean isMultipart=ServletFileUpload.isMultipartContent(request);
        if(isMultipart)
        {
            FileItemFactory factory=new DiskFileItemFactory();
            ServletFileUpload upload=new ServletFileUpload(factory);
            try {
                List<FileItem> items=upload.parseRequest(request);
                Iterator<FileItem> it = items.iterator();
                while(it.hasNext())
                {
                    FileItem item = it.next();
                    String itemname = item.getFieldName();
                    int sno=-1;
                    String sname=null;
                    if(item.isFormField())
                    {
                        if(itemname.equals("sno"))
                        {
                            sno=Integer.parseInt(item.getString("utf-8"));
                        }else if(itemname.equals("sname"))
                        {
                            sname=item.getString("utf-8");
                            sname=item.getName();
                        }else
                        {
                            System.out.println("其他字段");
                        }
                    }else
                    {
                        String filename=item.getName();
                        String path="E:\\javaCode\\easybuy\\web\\images";
                        File file=new File(path,filename);
                        item.write(file);
                        return;
                    }

                }
            } catch (FileUploadException e) {

                e.printStackTrace();
            } catch (Exception e) {

                e.printStackTrace();
            }
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

