package com.projects.controller;

import com.projects.entity.User;
import com.projects.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAll() {
        return  userService.getAll();
    }

    @PostMapping("/users")
    public User addOrUpdate(@Valid @RequestBody User p) {
        return  userService.addOrUpdate(p);
    }

    @DeleteMapping("/users/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);
    }


}
