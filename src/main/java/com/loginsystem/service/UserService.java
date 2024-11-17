package com.loginsystem.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    boolean verifyUser(String username,String password);
}
