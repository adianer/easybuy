package dao.imp;


import dao.UserDao;
import pojo.User;
import util.BaseDao;
import util.Page;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserImp implements UserDao {

    //注册
    @Override
    public  int registUser(Object[]objects){
        int i=0;
        StringBuffer sb = new StringBuffer();
        sb.append("insert easybuy_user (loginName,userName,password,sex,email,mobile)values(?,?,?,?,?,?) ");
        BaseDao baseDao = new BaseDao();
        try {
            i=baseDao.executeUpdate(sb.toString(), objects);
        }catch (Exception e){
            e.printStackTrace();
            i=-1;
        }

        return i;
    }

    //登录
    @Override
    public User getUser(HttpServletRequest request, String loginName) throws ServletException,IOException {
        User user=null;
        request.setCharacterEncoding("utf-8");
        StringBuffer sb = new StringBuffer();
        sb.append("select id,userName,sex,email,mobile,loginName,password " +
                "from easybuy_user where loginName=? ");
        List<Object> objects=new ArrayList<Object>();
        objects.add(loginName);
        ResultSet rs = null;
        BaseDao baseDao = new BaseDao();
        try {
            rs = baseDao.executeQuery(sb.toString(),objects.toArray());
            while (rs.next()) {
                user =new User();
                user.setLoginName(rs.getString("loginName"));
                user.setPassword(rs.getString("password"));
                user.setId(rs.getInt("id"));
                user.setUserName(rs.getString("userName"));
                user.setSex(Integer.parseInt(rs.getString("sex")));
                user.setEmail(rs.getString("email"));
                user.setMobile(rs.getString("mobile"));
                request.getSession().setAttribute("user",user);
            }}catch (Exception E){

        }
        return user;
    }

    @Override
    public Integer queryCount() throws SQLException {
        int i=0;
        String sql="SELECT COUNT(1) FROM `easybuy_user`";
        BaseDao baseDao=new BaseDao();
        ResultSet rs= baseDao.executeQuery(sql);
        if (rs.next()){
            i=rs.getInt(1);
        }
        return i;
    }

    @Override
    public List<User> Getfigall(Page page) throws SQLException {

        String sql="SELECT * FROM  `easybuy_user` LIMIT ?,?";
        int size= page.getPageSize();
        List<User> list=new ArrayList<>();
        List<Object> objects=new ArrayList<>();
        objects.add(page.getFirstRecord());
        objects.add(size);
        BaseDao baseDao=new BaseDao();
        ResultSet rs=baseDao.executeQuery(sql,objects.toArray());
        System.out.println("ssss:"+objects.toString());
        System.out.println("sql:"+page.getFirstRecord()+"=========="+size);
        while (rs.next()){
            User user=new User();
            user.setId(rs.getInt("id"));
            user.setLoginName(rs.getString("loginName"));
            user.setUserName(rs.getString("userName"));
            user.setSex(rs.getInt("sex"));
            user.setType(rs.getInt("type"));
            list.add(user);
        }
        return list;
    }
}