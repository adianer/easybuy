package dao;

import util.Page;

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
}
