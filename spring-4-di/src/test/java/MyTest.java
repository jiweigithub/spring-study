import com.jiwei.pojo.Student;
import com.jiwei.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /**
         * Student{
         *  name='夏萌',
         *  address=Address{address='陕西省西安市'},
         *  books=[红楼梦, 西游记, 水浒传, 三国演义],
         *  hobbys=[听歌, 敲代码, 看电影],
         *  cards={身份证=610523199208150515, 银行卡=610523199208150515},
         *  games=[LOL, COC, BOB],
         *  info={password=123456, url=男性, driver=20210609, username=小明},
         *  wife='null'}
         */
    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = context.getBean("user", User.class);
        User user1 = context.getBean("user", User.class);
        System.out.println(user.toString());
        System.out.println(user == user1);
    }

}
