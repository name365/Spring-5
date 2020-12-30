import com.github.subei.dao.UserDaoImpl;
import com.github.subei.dao.UserDaoMysqlImpl;
import com.github.subei.dao.UserDaoOracleImpl;
import com.github.subei.dao.UserDaoSqlserverImpl;
import com.github.subei.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        // 用户实际调用的是业务层，dao层不需要接触
        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
