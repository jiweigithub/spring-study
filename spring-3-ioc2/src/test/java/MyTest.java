import com.jiwei.pojo.User;
import com.jiwei.pojo.User2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        User user = new User();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        User2 user2 = (User2) context.getBean("user2");
        user.show();
        user2.show();
    }
}
