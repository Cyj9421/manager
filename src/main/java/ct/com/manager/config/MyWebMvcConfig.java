package ct.com.manager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        System.out.println("进入静态资源配置");
//        //扫描static下的所有html页面
//        registry.addResourceHandler("classpath:/static/*.html");
//        //扫描static下的所有资源
//        registry.addResourceHandler("/static/**");
//    }
}
