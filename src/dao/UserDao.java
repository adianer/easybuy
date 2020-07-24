package dao;

import pojo.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public interface UserDao {

    //注册
    public int registUser(Object[]objects);

    //登录
    public User getUser(HttpServletRequest request, String loginName) throws ServletException,IOException;


}