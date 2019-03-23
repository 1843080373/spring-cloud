package org.zmph.shop.usersrv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.zmph.shop.api.response.UserResponse;
import org.zmph.shop.api.ws.UserWSFeign;
import org.zmph.shop.usersrv.bean.User;
import org.zmph.shop.usersrv.mapper.UserMapper;

@RestController
public class UserController implements UserWSFeign{

	 @Autowired
	 private UserMapper userMapper;

	@Override
	public int deleteUser(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<UserResponse> findUserByPage(Integer pageNow, Integer pageSize) {
		return userMapper.findUserByPage(pageNow, pageSize);
	}

	@Override
	public int addUser(String userName, String password, String phone) {
		return userMapper.insert(new User(userName, password, phone));
	}

	@Override
	public int updateUser(Integer id, String userName, String password, String phone) {
		return userMapper.updateByPrimaryKeySelective(new User(id,userName, password, phone));
	}
}
