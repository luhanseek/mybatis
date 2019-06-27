package com.offcn.service;


import com.offcn.po.Car;
import com.offcn.service.Carservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;*/

@RestController
public class student {
    /*private List<Car> list= Collections.synchronizedList(new ArrayList<Car>());*/
@Autowired
private Carservices carservices;

    @PostMapping("/users")
    public String createCar(Car car){
        System.out.println("1111");
        carservices.createUser(car);
        System.out.println("22222");
        return "success";
    }

    @GetMapping("/users")
    public List<Car> findall(Car car){
        return carservices.getUserList();
    }
    @GetMapping("/users/{id}")
    public Car findane(@PathVariable("id") Integer id){
        return carservices.getUser(id);
    }
    @PutMapping("/users/{id}")
    public String updateCar(@PathVariable("id")Integer id,Car car){
        carservices.updateUser(id,car);
        return "true";
    }

    @DeleteMapping("/users/{id}")
    public String deleteCar(@PathVariable("id") Integer id){
        carservices.deleteUser(id);
        return "success";
    }
}
