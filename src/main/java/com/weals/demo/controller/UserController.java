package com.weals.demo.controller;

import com.weals.demo.model.UserDO;
import com.weals.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUserList")
    public String getUserList() {
        List<UserDO> allUserList = userService.getAllUserList();
        return "调用成功";
    }
}
