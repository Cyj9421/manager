package ct.com.manager.service;

import ct.com.manager.entitys.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Configuration;


@Configuration
public interface UserService {
    public int addUser(User user);
    public User login(String username,String password);
    public int  delUserByUid(@Param("uid") int uid);
    public int  updateUser(User user);
}
