package com.bank.mapper;

import com.bank.pojo.Account;

import java.util.List;

public interface AccountMapper {
    int insert(Account account);
    int deleteByActno(String actno);
    int update(Account account);
    Account selectByActno(String actno);
    List<Account> selectAll();
}
