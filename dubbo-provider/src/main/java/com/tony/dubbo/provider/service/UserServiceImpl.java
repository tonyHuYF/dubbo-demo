package com.tony.dubbo.provider.service;

import com.tony.dubbo.api.pojo.User;
import com.tony.dubbo.api.service.IUserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0")
public class UserServiceImpl implements IUserService {
    @Override
    public User queryUserByUserId(Integer userId) {
        System.out.println("服务提供方接收请求，查询参数-->" + userId);
        User user = new User(userId, "admin");
        return user;
    }
}
