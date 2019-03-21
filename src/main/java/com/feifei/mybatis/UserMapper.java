package com.feifei.mybatis;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
	
	public List<Object> getAlluser();
}
