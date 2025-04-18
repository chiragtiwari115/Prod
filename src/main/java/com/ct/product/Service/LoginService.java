package com.ct.product.Service;

import com.ct.product.Domain.User;
import com.ct.product.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private UserRepository userRepository;

    public String login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return "Login Successful!";
        }
        return "Invalid Credentials";
    }
}
