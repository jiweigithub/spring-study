import com.jiwei.controller.UserController;
import com.jiwei.pojo.MyUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.test();
    }
}
