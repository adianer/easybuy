package servies;

import dao.ProductDao;
import dao.imp.ProductImp;
import pojo.ProductCategory;
import util.Page;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

public class Productservies {
    public static ProductDao productDao=new ProductImp();
    public void getshowlist(HttpServletRequest request, int num) throws Exception {
        List<ProductCategory> list=null;
        Page page=new Page();
        page.setCount(productDao.getCount());
        if (num!=0){
            page.setPageNo(num);
        }
        list=productDao.getshowlist(page);
        request.setAttribute("page",page);
        request.setAttribute("list",list);
    }

    //添加分类
    public int add(List<Object> objects,String name){
        int i=0;
        try {
            i=productDao.getid(name);
            if (i==-1){
                return i;
            }
            objects.add(i);
            i=productDao.insertProduct(objects);
        } catch (SQLException e) {
            e.printStackTrace();
            i=-1;
        }
        return i;
    }

    //根据id删除
    public int delbyId(int id){
        int i=0;
        i=productDao.deleteProduct(id);
        return i;
    }
}
