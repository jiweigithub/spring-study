package com.jiwei.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于在容器中注册了一个bean,id = 'myUser'
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MyUser {
    @Value(value = "啦啦啦")
    public String name;
}
