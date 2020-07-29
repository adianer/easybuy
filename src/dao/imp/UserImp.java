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
import java.util.Arrays;
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
     //查询用户有几个
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
    //用户分页
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

    @Override
    public Integer UaerAdd(User user) {
        String sql="INSERT INTO `easybuy_user`(`loginName`,`userName`,`password`,`identityCode`,`email`,`mobile`,`type`)VALUES(?,?,?,?,?,?,?)";
       BaseDao baseDao=new BaseDao();

     int i=  baseDao.executeUpdate(sql,
             new Object[]{
                     user.getLoginName(),
                     user.getUserName(),
                     user.getPassword(),
                     user.getIdentityCode(),
                     user.getEmail(),
                     user.getMobile(),
                     user.getType()
             });
        return i;
    }

    @Override
    public User UserGetId(Integer id) throws SQLException {
      String sql="SELECT * FROM `easybuy_user` WHERE id=?";
      User user=null;
      BaseDao baseDao=new BaseDao();
        List<Object> objects = new ArrayList<Object>();
        objects.add(id);
      ResultSet rs=  baseDao.executeQuery(sql,objects.toArray());
      while (rs.next()){
        user=new User();
       user.setId(rs.getInt("id"));
       user.setLoginName(rs.getString("loginName"));
       user.setUserName(rs.getString("userName"));
       user.setIdentityCode(rs.getString("identityCode"));
       user.setEmail(rs.getString("email"));
       user.setMobile(rs.getString("mobile"));
       user.setType(rs.getInt("type"));
      }
        return user;
    }

    @Override
    public Integer Userupdate(User user) {
        BaseDao baseDao=new BaseDao();
        StringBuffer sb=new StringBuffer();
        sb.append("UPDATE `easybuy_user` SET");
        List<Object> objects = new ArrayList<Object>();
        Integer i=0;
        if (user.getLoginName()!=null){
         sb.append(" loginName=?,");
         objects.add(user.getLoginName());
        }
        if (user.getUserName()!=null){
            sb.append(" userName=?,");
            objects.add(user.getUserName());
        }
        if (user.getIdentityCode()!=null){
            sb.append(" identityCode=?,");
            objects.add(user.getIdentityCode());
        }
        if (user.getEmail()!=null){
            sb.append(" email=?,");
            objects.add(user.getEmail());
        }
        if (user.getMobile()!=null){
            sb.append(" mobile=?,");
            objects.add(user.getMobile());
        }
        if (user.getType()!=null){
            sb.append(" type=?,");
            objects.add(user.getType());
        }

       sb.delete(sb.length()-1,sb.length());
        System.out.println(sb.length());
        sb.append(" where id=?");
        objects.add(user.getId());

        System.out.println(sb.toString());

        return   baseDao.executeUpdate(sb.toString(),objects.toArray());
    }
}