package ct.com.manager.service.impl;

import ct.com.manager.dao.UserDao;
import ct.com.manager.entitys.User;
import ct.com.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public int addUser(User user) {
        user.setReg_time(new Date());
        user.setGroupid(2);
        System.out.println(user);
        return userDao.addUser(user);
    }

    @Override
    public User login(String username,String password) {
        return userDao.login(username,password);
    }

    @Override
    public int delUserByUid(int uid) {
        return userDao.delUserByUid(uid);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }
}
