package dao.imp;

import dao.NewsDao;
import pojo.News;
import pojo.ProductCategory;
import util.BaseDao;
import util.Page;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsImp implements NewsDao {
    @Override
    public List getshowlist(Page page) throws Exception {
        List list=new ArrayList();
        String sql="SELECT id,title,content,createTime,user FROM easybuy_news ORDER BY createTime DESC limit ?,?";
        List<Object> objects = new ArrayList<Object>();
        objects.add(page.getPageSize()*(page.getPageNo()-1));
        objects.add(page.getPageSize());
        BaseDao baseDao = new BaseDao();
        ResultSet rs= baseDao.executeQuery(sql,objects.toArray());
        News news;
        while (rs.next())
        {
            news=new News();
            news.setId(rs.getInt("id"));
            news.setTitle(rs.getString("title"));
            news.setContent(rs.getString("content"));
            news.setCreateTime(rs.getString("createTime"));
            news.setUser(rs.getString("user"));
            list.add(news);
        }
        return  list;
    }

    @Override
    public int getCount() {
        String sql="SELECT COUNT(1) FROM easybuy_news";
        List<Object> o=new ArrayList<>();
        BaseDao base=new BaseDao();
        ResultSet rs= base.executeQuery(sql);
        int count=0;
        try {
            if(rs.next()){
                count=rs.getInt(1);
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return count;
    }

    @Override
    public int insertNews(List<Object> objects) {
        int i=0;
        BaseDao baseDao=new BaseDao();
        String sql="insert easybuy_news (title,content,createTime,user)values( ?,?,?,?)";
        try {
            i = baseDao.executeUpdate(sql, objects.toArray());
        }catch (Exception e){
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int deleteNews(int id) {
        int i=0;
        BaseDao baseDao=new BaseDao();
        String sql="DELETE FROM easybuy_news where id =";
        sql+=id;
        i=baseDao.executeUpdate(sql);
        return i;
    }

    @Override
    public int updataNews(List<Object> objects) {
        int i=0;
        BaseDao baseDao=new BaseDao();
        String sql="insert easybuy_news (title,content,createTime,user) values( ?,?,?,?)";
        try {
            i = baseDao.executeUpdate(sql, objects.toArray());
        }catch (Exception e){
            e.printStackTrace();
            i=-1;
        }
        return i;
    }
}
