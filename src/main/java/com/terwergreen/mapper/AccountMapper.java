package com.terwergreen.mapper;

import com.terwergreen.pojo.Account;

import java.util.List;

/**
 * @author: terwer
 * @date: 2021/12/23 21:09
 * @description: 定义Dap层接口方法
 */
public interface AccountMapper {
    /**
     * 查询account表数据
     */
    List<Account> queryAccountList() throws Exception;
}
