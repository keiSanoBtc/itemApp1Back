package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.Book;
import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User userSearch(UserSearchRequest userSearchRequest) {
        return userMapper.userSearch(userSearchRequest);
    }

    public List<Book> userPlanBookList(UserSearchRequest userSearchRequest) {
        return userMapper.userPlanBookList(userSearchRequest);
    }

    public void deletePlanBook(UserSearchRequest userSearchRequest) {
        userMapper.deletePlanBook(userSearchRequest);
    }

    public void postBook(UserSearchRequest userSearchRequest) {
        userMapper.postBook(userSearchRequest);
    }
}
