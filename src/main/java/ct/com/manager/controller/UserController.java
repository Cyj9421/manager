package ct.com.manager.controller;

import ct.com.manager.entitys.User;
import ct.com.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    //登录用户
    @RequestMapping("/user/login")
    @ResponseBody
    public String login(String username,String password){
            User user=userService.login(username,password);
            if(user!=null) {
                System.out.println(user.getUsername());
                return "/index.html";
            }else{
               return "/login.html" ;
            }
    }
    //注册用户
    @RequestMapping("/user/register")
    @ResponseBody
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "login";
    }

}
