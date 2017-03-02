package com.zhao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhao.mapper.UserMapper;
import com.zhao.pojo.User;
import com.zhao.pojo.UserExample;
import com.zhao.pojo.UserExample.Criteria;
import com.zhao.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	@Override
	public List<User> findAll() {
		UserExample example = new UserExample();
		List<User> list=	userMapper.selectByExample(example);
		return list;
	}
	@Override
	public User findById(Integer idUser) {
		User user =	userMapper.selectByPrimaryKey(idUser);

		return user;
	}
	@Override
	public void update(User user) {

		int i =userMapper.updateByPrimaryKey(user);

	}
	@Override
	public void deleteById(Integer iduser) {
		// TODO Auto-generated method stub
		userMapper.deleteByPrimaryKey(iduser);
	}
	@Override
	public void insert(User user) {
		userMapper.insert(user);

	}

}
