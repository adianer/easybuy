package servies;

import dao.ProductCategoryDao;
import dao.imp.ProductCategoryImp;
import pojo.Product;
import pojo.ProductCategory;
import util.BaseDao;
import util.Page;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductCategoryservies {
    public ProductCategoryDao productCategorydao=new ProductCategoryImp();
    //获取展示列表
    public void getshowlist(HttpServletRequest request,int num) throws Exception {
        List<ProductCategory> list=null;
        Page page=new Page();
        page.setCount(productCategorydao.getCount());
        if (num!=0){
            page.setPageNo(num);
        }
        list=productCategorydao.getshowlist(page);
        request.setAttribute("page",page);
        request.setAttribute("classlist",list);
    }

    //添加分类
    public int inserProductCategory(List<Object> objects, String name){
        int i=0;

        try {
            i=productCategorydao.getid(name);
            if (i==-1){
                return i;
            }
            objects.add(i);
           i=productCategorydao.insertProductCategory(objects);
        } catch (SQLException e) {
            e.printStackTrace();
            i=-1;
        }
        return i;
    }

    //根据id删除
    public int delbyId(int id){
        int i=0;
        i=productCategorydao.deleteProductCategory(id);
        return i;
    }

    //获取类列表
    public List<ProductCategory> getClassify(HttpServletRequest request, int id){
        List<ProductCategory> parlist=null;
        try {
            parlist=productCategorydao.getClassify( request,id);
            request.getSession().setAttribute("parlist",parlist);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return parlist;
    }
}
