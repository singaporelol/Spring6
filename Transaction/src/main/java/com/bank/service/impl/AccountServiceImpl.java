package com.bank.service.impl;

import com.bank.dao.AccountDao;
import com.bank.pojo.Account;
import com.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional
public class AccountServiceImpl  implements AccountService {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Override
    public void transfer(String fromActno, String toActno, double money) throws Exception {
        Account fromAct = accountDao.selectByActno(fromActno);
        if(fromAct.getBalance() < money){
            throw new Exception("账号余额不足");
        }
        Account toAct = accountDao.selectByActno(toActno);
        fromAct.setBalance(fromAct.getBalance()-money);
        toAct.setBalance(toAct.getBalance()+money);
        int count = accountDao.update(fromAct);

        // 模拟异常
        String s = null;
        s.toString();
        count+=accountDao.update(toAct);

        if(count !=2){
            throw new RuntimeException("转账失败，请联系银行！");
        }
    }
}
