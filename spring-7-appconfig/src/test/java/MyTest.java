import com.jiwei.config.AppConfig;
import com.jiwei.pojo.Boy;
import com.jiwei.pojo.Girl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        Girl girl2 = (Girl) context.getBean("beanGirl");
        Girl girl = (Girl) context.getBean("girl");
        Boy getBoy = context.getBean("getBoy", Boy.class);
        Boy getBoy2 = context.getBean("getBoy", Boy.class);
        System.out.println(girl.toString());
        System.out.println(girl2.toString());
        System.out.println(girl == girl2);
        System.out.println(getBoy==getBoy2);
    }
}
