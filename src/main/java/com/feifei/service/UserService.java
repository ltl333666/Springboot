package com.feifei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feifei.mybatis.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<Object> getAlluser(){
		return userMapper.getAlluser();
	}
}
