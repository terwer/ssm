package com.terwergreen.service;

import com.terwergreen.pojo.Account;

import java.util.List;

/**
 * @author: terwer
 * @date: 2021/12/23 21:17
 * @description:
 */
public interface AccountService {
    List<Account> queryAccountList() throws Exception;
}
