package dao;

import pojo.Product;
import util.Page;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
    //获取显示列表
    public List getshowlist(Page page) throws Exception;


    //获取总记录数
    public int getCount();

    //添加商品
    public int insertProduct(List<Object> objects );

    //根据ID删除
    public int deleteProduct(int id);

    //根据id查询
    public Product querybyId(int id);

    //修改商品
    public int updataProduct(List<Object> objects );
}
