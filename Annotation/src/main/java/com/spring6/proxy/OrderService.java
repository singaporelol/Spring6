package com.spring6.proxy;

import com.spring6.dao.OrderDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Resource
    private OrderDao orderDao;

    public void save(){
        orderDao.save();
    }
}
