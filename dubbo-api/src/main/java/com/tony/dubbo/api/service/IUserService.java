package com.tony.dubbo.api.service;

import com.tony.dubbo.api.pojo.User;

public interface IUserService {
    public User queryUserByUserId(Integer userId);
}
