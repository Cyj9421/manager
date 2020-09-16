package ct.com.manager;

import ct.com.manager.dao.UserDao;
import ct.com.manager.entitys.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class ManagerApplicationTests {
    @Autowired
    UserDao userDao;
    @Test
    void login() {
        User user=userDao.login("cyj","9421");
        System.out.println(user.getUsername());
    }
    @Test
    void addUser(){
        User user=new User(1,"cyj",1,"9421","1.jpg","2.jpg","643379347@qq.com","略略略",0,0);
        int result=userDao.addUser(user);
        System.out.println(result);
    }

}
