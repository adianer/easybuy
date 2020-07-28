package servies;


import dao.UserDao;
import dao.imp.UserImp;
import pojo.User;
import util.Page;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Userservies {
public  static UserDao userdao = new UserImp();
    //注册
    public int regist(Object[]objects) throws Exception {
        int i = 0;

        i = userdao.registUser(objects);
        return i;
    }

    //登录
    public int isenter(HttpServletRequest request, String loginName, String password) throws ServletException, IOException {
        int isenter = -1;
        User user = userdao.getUser(request, loginName);
        if (user == null) {
            isenter =  0;  // 用户名不存在
        }
        if (!user.getPassword().equals(password)) {
            isenter =  2;  //用户名存在  ,密码错误
        } else {
            isenter = 1;
            request.getSession().setAttribute("user", user);
        }
        return isenter;
    }

   //分页查询
    public Page<User> Getfigall( Integer pageNo) {
        Page<User> page=new Page();
        try {
            Integer i=userdao.queryCount();
            page.setCount(i);
            if (pageNo<0 || pageNo>page.getPageCount()){
                page.setPageNo(1);
            }else {
                page.setPageNo(pageNo);
            }
            List<User> list= userdao.Getfigall(page);
            page.setDate(list);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return page;
    }

  public  Integer  UaerAdd(User user){

       return userdao.UaerAdd(user);

  }



}
