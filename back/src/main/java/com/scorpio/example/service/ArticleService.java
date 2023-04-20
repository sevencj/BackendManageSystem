package com.scorpio.example.service;

import com.alibaba.fastjson.JSONObject;

public interface ArticleService {
	/**
	 * 新增文章
	 */
	JSONObject addArticle(JSONObject jsonObject);

	/**
	 * 文章列表
	 */
	JSONObject listArticle(JSONObject jsonObject);

	/**
	 * 更新文章
	 */
	JSONObject updateArticle(JSONObject jsonObject);


	/**
	 * 删除文章
	 */
	JSONObject removeArticle(Integer id);
}
