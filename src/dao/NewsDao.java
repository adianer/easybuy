package dao;

import pojo.News;
import util.Page;

import java.sql.SQLException;
import java.util.List;

public interface NewsDao {
    //获取显示列表
    public List getshowlist(Page page) throws Exception;

    //获取总记录数
    public int getCount();

    //添加商品分类
    public int insertNews(List<Object> objects );

    //根据ID删除
    public int deleteNews(int id);

    //修改商品
    public int updataNews(List<Object> objects );
    //根据id查询
    public News querybyId(int id) throws SQLException;
}
