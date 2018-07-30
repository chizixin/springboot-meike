package com.layui.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.layui.entity.User;
import org.springframework.stereotype.Service;
import com.layui.service.IUserService;
import com.layui.mapper.IUserMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HOU
 * @since 2018-04-17
 */
@Service
public class UserServiceImpl implements IUserService{

	@Resource
	private IUserMapper userMapper;

	@Override
	public List<User> getUserList() {
		return userMapper.selectList(new EntityWrapper<User>());
	}

	@Override
	public Integer insertUser(User user) {
		return userMapper.insert(user);
	}
}
