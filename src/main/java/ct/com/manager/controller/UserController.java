package ct.com.manager.controller;

import ct.com.manager.entitys.User;
import ct.com.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class UserController {
    ModelAndView modelAndView = new ModelAndView();
    @Autowired
    UserService userService;

    //登录用户
    @RequestMapping("/user/login")
    @ResponseBody
    public ModelAndView login(String username, String password) {
        User user = userService.login(username, password);
        modelAndView.clear();
        if (user != null) {
            modelAndView.setViewName("index");
            return modelAndView;
        } else {
            modelAndView.setViewName("login");
            return modelAndView;
        }
    }

    //注册用户
    @RequestMapping("/user/register")
    @ResponseBody
    public ModelAndView addUser(@RequestBody User user) {
        modelAndView.clear();
        int result=userService.addUser(user);
            if(result>0) {
                System.out.println("2");
                modelAndView.setViewName("login");
                return modelAndView;
            }else {
                System.out.println("3");
                modelAndView.setViewName("register");
                return modelAndView;
            }
    }

    @RequestMapping("/test")//进入登录界面
    @ResponseBody
    public ModelAndView test() {
        modelAndView.clear();
        modelAndView.setViewName("login");
        return modelAndView;

    }
}
