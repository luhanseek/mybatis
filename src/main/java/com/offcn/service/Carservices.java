package com.offcn.service;

import com.offcn.po.Car;

import java.util.List;

public interface Carservices {
    //获取全部用户数据
    public List<Car> getUserList();
    //新增用户数据
    public void createUser(Car car);
    //获取指定 id 用户信息
    public Car getUser(Integer id);
    //更新指定 id 用户信息
    public void updateUser(Integer id, Car car);
    //删除指定 id 用户
    public void deleteUser(Integer id);
}
