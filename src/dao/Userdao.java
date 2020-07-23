package dao;


import pojo.User;
import util.BaseDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Userdao {
    public  int regist(Object[]objects){
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
}