package com.tony.dubbo.consumer.controller;

import com.tony.dubbo.api.pojo.User;
import com.tony.dubbo.api.service.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @DubboReference(version = "1.0", parameters = {"unicast", "false"})
    private IUserService userService;

    @GetMapping("/{userId}")
    public User queryUser(@PathVariable Integer userId) {
        User user = userService.queryUserByUserId(userId);
        return user;
    }
}
