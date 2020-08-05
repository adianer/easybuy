package servies;

import dao.NewsDao;
import dao.imp.NewsImp;
import pojo.News;
import util.Page;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

public class Newsservies {
    public static NewsDao newsDao=new NewsImp();
    //获取展示列表
    public void getshowlist(HttpServletRequest request, int num) throws Exception {
        List<News> list=null;
        Page page=new Page();
        page.setCount(newsDao.getCount());
        if (num!=0){
            page.setPageNo(num);
        }
        list=newsDao.getshowlist(page);
        request.setAttribute("page",page);
        request.setAttribute("news",list);
    }
    //添加分类
    public int inserNews(List<Object> objects){
        int i=-1;
        i=newsDao.insertNews(objects);
        return i;
    }
    //根据id删除
    public int delbyId(int id){
        int i=0;
        i=newsDao.deleteNews(id);
        return i;
    }
}
