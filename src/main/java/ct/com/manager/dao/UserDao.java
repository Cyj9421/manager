package ct.com.manager.dao;

import ct.com.manager.entitys.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    public int addUser(User user);//注册用户
    public User login(@Param("username") String username, @Param("password") String password);//登录用户
    public int  delUserByUid(int uid);//删除用户
    public int  updateUser(User user);//修改用户
}
