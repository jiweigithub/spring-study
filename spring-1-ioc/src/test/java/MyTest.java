import com.jiwei.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象,拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象都在spring中管理了,我们要使用，直接去里面取出来就可以了
        UserService userService = (UserService) context.getBean("userServiceImpl");
        userService.getUser();
    }
}
