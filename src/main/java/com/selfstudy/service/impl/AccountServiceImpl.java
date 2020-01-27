package com.selfstudy.service.impl;

import com.selfstudy.service.IaccountService;
import org.springframework.stereotype.Service;


@Service("accountService")
public class AccountServiceImpl implements IaccountService {

    public void saveAccount() {
        System.out.println("执行了保存");
        int i = 1/0;
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新");

    }

    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
