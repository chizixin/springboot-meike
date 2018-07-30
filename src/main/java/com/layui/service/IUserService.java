package com.layui.service;

import com.layui.entity.User;

import java.util.List;

/**
 * <p>
 *  接口
 * </p>
 *
 * @author HOU
 * @since 2018-04-17
 */
public interface IUserService{

    List<User> getUserList();

    Integer insertUser(User user);
}
