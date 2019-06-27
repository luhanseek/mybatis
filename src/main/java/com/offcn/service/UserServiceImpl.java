package com.offcn.service;

import com.offcn.dao.Carservice;
import com.offcn.po.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements Carservices {

    @Autowired
    Carservice carservice;
    @Override
    public List<Car> getUserList() {
        return carservice.getUserList();
    }

    @Override
    public void createUser(Car car) {
        carservice.createUser(car);

    }

    @Override
    public Car getUser(Integer id) {
        return carservice.getUser(id);
    }

    @Override
    public void updateUser(Integer id, Car car) {
        car.setId(id);
        carservice.updateUser(car);
    }

    @Override
    public void deleteUser(Integer id) {
        carservice.deleteUser(id);
    }
}
