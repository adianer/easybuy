package servies;

import dao.ProductCategorydao;
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
    //获取展示列表
    public void getshowlist(HttpServletRequest request,int num) throws Exception {
        List<ProductCategory> list=null;
        ProductCategorydao productCategorydao=new ProductCategorydao();
        Page page=new Page();
        page.setCount(productCategorydao.getcount());
        if (num!=0){
            page.setPageNo(num);
        }
        list=productCategorydao.getshowlist(page);
        request.setAttribute("page",page);
        request.setAttribute("list",list);
    }

    //添加分类
    public int add(List<Object> objects,String name){
        int i=0;
        ProductCategorydao productCategorydao=new ProductCategorydao();
        try {
            i=productCategorydao.getid(name);
            if (i==-1){
                return i;
            }
            objects.add(i);
           i=productCategorydao.add(objects);
        } catch (SQLException e) {
            e.printStackTrace();
            i=-1;
        }
        return i;
    }

    //根据id删除
    public int delbyId(int id){
        int i=0;
        ProductCategorydao productCategorydao=new ProductCategorydao();
        i=productCategorydao.del(id);
        return i;
    }
}
