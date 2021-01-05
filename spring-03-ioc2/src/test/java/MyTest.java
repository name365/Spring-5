import com.github.subei.pojo.User;
import com.github.subei.pojo.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 在执行getBean的时候, user已经创建好, 通过无参构造
        User user = (User) context.getBean("user");
        // 调用对象的方法 .
        user.show();
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 在执行getBean的时候, user已经创建好, 通过无参构造
        UserT user = (UserT) context.getBean("u3");
        // 调用对象的方法 .
        user.show();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 在执行getBean的时候, user已经创建好, 通过无参构造
        UserT user = (UserT) context.getBean("u3");
        // 调用对象的方法 .
        user.show();
    }
}
