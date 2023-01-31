package com.mybatis.mapper;

import com.mybatis.pojo.Car;

import java.util.List;

public interface CarMapper {
    /**
     * 新增Car
     * @param car
     * @return
     * */
    int insert(Car car);
    int deleteById(Long id);
    int update(Car car);
    Car selectById(long id);
    List<Car> selectAll();

}
