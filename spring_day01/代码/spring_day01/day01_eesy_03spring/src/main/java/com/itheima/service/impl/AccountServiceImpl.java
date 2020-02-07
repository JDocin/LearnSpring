package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao ; //service里没有注入dao所以在service对象里调用dao是空指针，解决见5

    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }

    public void  saveAccount(){
        accountDao.saveAccount();
    }
}
