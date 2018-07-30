package com.layui.controller;


import com.layui.entity.User;
import com.layui.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HOU
 * @since 2018-04-17
 */
@RestController
@Slf4j
public class UserController {


    @Resource
    private IUserService userService;

    @GetMapping(value="test")
    public List<User> test(){
        List<User> list = userService.getUserList();
        System.out.println("zzz");
        return list;
    }

    @PostMapping(value = "/insertUser")
    public String insertUser(User user){
        Integer s  = userService.insertUser(user);
        return s+"";
    }


	
}
