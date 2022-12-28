package com.bank.dao;

import com.bank.pojo.Account;

public interface AccountDao {

    Account selectByActno(String actno);

    int update(Account act);
}
