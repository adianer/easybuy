package servies;


import dao.Userdao;
import pojo.User;
import util.BaseDao;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Userservies {

    //注册
    public int regist(Object[]objects) throws Exception {
        int i = 0;
        Userdao userdao = new Userdao();
        i = userdao.regist(objects);
        return i;
    }

    //登录
    public int isenter(HttpServletRequest request, String loginName, String password) throws ServletException, IOException {
        int isenter = -1;
        Userdao userdao = new Userdao();
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
}
