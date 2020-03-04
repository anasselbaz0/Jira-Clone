package com.projects.service;

import com.projects.entity.User;
import com.projects.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User addOrUpdate(User u) {
        return userRepository.save(u);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}
