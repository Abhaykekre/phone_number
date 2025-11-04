package com.example.phonenumber.Controller;

import com.example.phonenumber.Model.User;
import com.example.phonenumber.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    UserService service;

    @GetMapping("/user")
    List<User> getAll()
    {
        return service.getAllList();
    }

    @PostMapping("/user")
    User save(@RequestBody User user)
    {
        return service.save(user);
    }

    @DeleteMapping("/user/{id}")
    void delete(@PathVariable String id)
    {
        service.delete(id);
    }


    @PutMapping("/user")
    User update(@RequestBody User user)
    {
      return service.update(user);
    }
}
