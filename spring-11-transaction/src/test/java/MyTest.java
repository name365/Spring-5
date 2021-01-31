import com.github.subei.mapper.UserMapper;
import com.github.subei.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class MyTest {
    @Test
    public void selectUser() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationCon.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        List<User> userList = userMapper.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
