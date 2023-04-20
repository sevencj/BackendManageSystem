package com.scorpio.example.service;

import com.alibaba.fastjson.JSONObject;
import com.scorpio.example.model.entity.UserEntity;

/**
 * @description: 登录Service
 */
public interface LoginService {
	/**
	 * 登录表单提交
	 */
	JSONObject authLogin(UserEntity user);

	/**
	 * 根据用户名和密码查询对应的用户
	 *  @param username 用户名
	 * @param password 密码
     * @return
     */
	UserEntity getUser(String username, String password);

	/**
	 * 查询当前登录用户的权限等信息
	 */
	JSONObject getInfo();

	/**
	 * 退出登录
	 */
	JSONObject logout();
}
