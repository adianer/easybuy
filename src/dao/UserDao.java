package dao;

import pojo.User;
import util.Page;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface UserDao {

    //注册
    public int registUser(Object[]objects);

    //登录
    public User getUser(HttpServletRequest request, String loginName) throws ServletException,IOException;


    //查询用户所有信息
    Integer queryCount() throws SQLException;

    //分页查询用户信息
    List<User> Getfigall(Page page) throws SQLException;

}