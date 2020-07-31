package servies;


import dao.UserDao;
import dao.imp.UserImp;
import org.omg.CORBA.PUBLIC_MEMBER;
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

       try{
           User user = userdao.getUser(request, loginName);
           isenter = 1;
           request.getSession().setAttribute("user", user);
           if(user==null){
               isenter=-1;
           }
       }catch (Exception e){
           e.printStackTrace();
           isenter=0;
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
  public User UserGetId(Integer id){
        User user=null;
      try {
         user=    userdao.UserGetId(id);
      } catch (SQLException throwables) {
          throwables.printStackTrace();
      }
      return user ;
  }


  public Integer Userupdate(User user){
        
        return userdao.Userupdate(user);
  }

}
