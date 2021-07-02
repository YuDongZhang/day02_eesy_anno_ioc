package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import org.springframework.stereotype.Component;

/**
 * 账户的业务层实现类
 * <bean id="accountService" class="com.itheima.service.impl.AccountServiceImpl"
 *       scope=""  init-method="" destroy-method="">
 *     <property name=""  value="" | ref=""></property>
 * </bean>
 *
 * 用于创建对象的
 *      他们的作用就和在XML配置文件中编写一个<bean>标签实现的功能是一样的
 *    Component:
 *         作用：用于把当前类对象存入spring容器中
 *         属性：
 *             value：用于指定bean的id。当我们不写时，它的默认值是当前类名，且首字母改小写。
 *     Controller：一般用在表现层
 *     Service：一般用在业务层
 *     Repository：一般用在持久层
 *     以上三个注解他们的作用和属性与Component是一模一样。
 *     他们三个是spring框架为我们提供明确的三层使用的注解，使我们的三层对象更加清晰
 *
 *
 * 用于注入数据的
 *      他们的作用就和在xml配置文件中的bean标签中写一个<property>标签的作用是一样的
 *
 * 用于改变作用范围的
 *      他们的作用就和在bean标签中使用scope属性实现的功能是一样的
 *
 *  和生命周期相关 了解
 *      他们的作用就和在bean标签中使用init-method和destroy-methode的作用是一样的
 */
@Component("accountService")
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public AccountServiceImpl() {
        System.out.println("AccountServiceImpl对象创建了-------");
    }

    public void  saveAccount(){
        accountDao.saveAccount();
    }
}