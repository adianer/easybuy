import org.junit.Test;
import pojo.User;
import servies.Userservies;
import util.Page;

public class demo {


    @Test
    public  void F1(){
        Userservies userservies=new Userservies();
       Page<User> page= userservies.Getfigall(0);

        for (User u:page.getDate()) {
            System.out.println(u);
        }
    }

}
