package com.scorpio.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.scorpio.example.model.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @description: 登录相关dao
 */
public interface LoginDao {
	/**
	 * 根据用户名和密码查询对应的用户
	 */
	UserEntity getUser(@Param("username") String username, @Param("password") String password);
}
