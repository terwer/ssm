package com.terwergreen.service.impl;

import com.terwergreen.mapper.AccountMapper;
import com.terwergreen.pojo.Account;
import com.terwergreen.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: terwer
 * @date: 2021/12/23 21:18
 * @description:
 */
@Transactional
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> queryAccountList() throws Exception {
        return accountMapper.queryAccountList();
    }
}
