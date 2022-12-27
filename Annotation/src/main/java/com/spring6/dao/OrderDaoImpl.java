package com.spring6.dao;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("order is saved!!");
    }
}
