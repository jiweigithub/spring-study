package com.jiwei.config;

import com.jiwei.pojo.Boy;
import com.jiwei.pojo.Girl;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

/**
 * @Configuration注解，表示该类是一个配置类，等价于一个beans.xml
 * @Configuration注解组合了@Component注解，也意味着，AppConfig也会被注册到容器中
 * @ComponentScan等价于context:component-scan标签，指定了要扫描哪些包下的组件
 * @Import注解等价于xml配置文件的import标签，可以引入其他的配置类
 */
@Configuration
@ComponentScan(basePackages = "com.jiwei")
@Import(AppConfig2.class)
public class AppConfig {

    /**
     * @return
     * @Bean注解，可以这么理解， 是一个更灵活将bean注册到容器中的方式，
     * 解决了spring去管理第三方包下对象的创建的问题，
     * 默认是单例的
     */
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Boy getBoy() {
        Boy boy = new Boy();
        boy.setName("测试");
        return boy;
    }

    /**
     * lazy注解，表示懒加载
     * @return
     */
    @Bean
    @Lazy
    public Girl beanGirl() {
        Girl girl = new Girl();
        girl.setName("@Bean Girl");
        return girl;
    }

}
