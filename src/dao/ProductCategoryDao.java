package dao;

import util.Page;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

public interface ProductCategoryDao {
    //获取显示列表
    public List getshowlist(Page page) throws Exception;


    //获取总记录数
    public int getCount();

    //添加商品分类
    public int insertProductCategory(List<Object> objects );

    //获取父类id
    public int getid(String name) throws SQLException;

    //根据ID删除
    public int deleteProductCategory(int id);

    //获取父列表
    public List getClassify(HttpServletRequest request, int id) throws Exception;
}
