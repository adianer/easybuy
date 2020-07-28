import org.junit.Test;
import pojo.User;
import servies.Userservies;
import util.Page;

public class demo {


    @Test
    public  void F1(){
        Userservies userservies=new Userservies();
       Page<User> page= userservies.Getfigall(1);
        for (User u:page.getDate()) {
            System.out.println(u);
        }
    }

    @Test
    public void f2(){
        Userservies userservies=new Userservies();
        User user =new User();
        user.setLoginName("ljj");
        user.setUserName("林俊杰");
        user.setPassword("123456");
        user.setIdentityCode("140225198841547785");
        user.setEmail("12345234@qq.com");
        user.setMobile("1234455566");
        user.setType(2);
       Integer i= userservies.UaerAdd(user);
       if (i>0){
           System.out.println("成功！！！！");
       }else {
           System.out.println("失败了");
       }
    }
}
