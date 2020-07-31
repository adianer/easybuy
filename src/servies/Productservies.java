package servies;

import dao.ProductDao;
import dao.imp.ProductImp;
import pojo.Product;
import pojo.ProductCategory;
import servlet.ProductInfo;
import util.Page;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

public class Productservies {
    public static ProductDao productDao=new ProductImp();
    //获取显示列表
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

    //根据id删除
    public int deletebyId(int id){
        int i=0;
        i=productDao.deleteProduct(id);
        return i;
    }
    //根据id查询
    public Product querybyId( HttpServletRequest request, int id){
        Product product=null;
        product=productDao.querybyId(id);
        request.setAttribute("productinfo", product);
        return product;
    }
    //添加商品
    public int inserProduct(List<Object> objects,HttpServletRequest request){
        int i=0;
        i=productDao.insertProduct(objects);
        return i;
    }
    //修改商品
    public int updataProduct(List<Object> objects){
        int i=0;
        i=productDao.updataProduct(objects);
        return i;
    }
}
