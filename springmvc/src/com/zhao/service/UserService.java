package com.zhao.service;

import java.util.List;

import com.zhao.pojo.User;

public interface UserService {
		List<User> findAll();
		User findById(Integer idUser);
		void update(User user);
		void deleteById(Integer iduser);
		void insert(User user);
}
