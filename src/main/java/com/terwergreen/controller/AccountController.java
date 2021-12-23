package com.terwergreen.controller;

import com.terwergreen.pojo.Account;
import com.terwergreen.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: terwer
 * @date: 2021/12/23 22:27
 * @description:
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    /**
     * Spring容器和Spring MVC容器的不同
     * Spring容器：service对象和Dao层对象
     * Spring MVC：controller层对象
     */

    @Autowired
    private AccountService accountService;

    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Account> queryAll() throws Exception {
        return accountService.queryAccountList();
    }
}
