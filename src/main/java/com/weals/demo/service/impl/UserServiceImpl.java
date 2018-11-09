package com.weals.demo.service.impl;

import com.weals.demo.mapper.UserMapper;
import com.weals.demo.model.UserDO;
import com.weals.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDO> getAllUserList() {
        List<UserDO> getAllUserList = userMapper.getAllUserList();
        return getAllUserList;
    }
}
