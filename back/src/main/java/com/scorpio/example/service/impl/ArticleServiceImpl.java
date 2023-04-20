package com.scorpio.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.scorpio.example.dao.ArticleDao;
import com.scorpio.example.dao.ArticleRepository;
import com.scorpio.example.model.entity.ArticleEntity;
import com.scorpio.example.service.ArticleService;
import com.scorpio.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;
	@Autowired
	private ArticleRepository articleRepository;

	/**
	 * 新增文章
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject addArticle(JSONObject jsonObject) {
		articleDao.addArticle(jsonObject);
		return CommonUtil.successJson();
	}

	/**
	 * 文章列表
	 */
	@Override
	public JSONObject listArticle(JSONObject jsonObject) {
		CommonUtil.fillPageParam(jsonObject);
		int count = articleDao.countArticle(jsonObject);
		List<ArticleEntity> list = articleDao.listArticle(jsonObject);
		return CommonUtil.successPage(jsonObject, list, count);
	}

	/**
	 * 更新文章
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject updateArticle(JSONObject jsonObject) {
		articleDao.updateArticle(jsonObject);
		return CommonUtil.successJson();
	}


	/**
	 * 根据id删除文章
	 * @author Will
	 * @date 3/21/2023 2:31 PM
	 * @param id 文章id
	 * @return JSONObject
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject removeArticle(Integer id) {
		articleDao.removeArticle(id);
		return CommonUtil.successJson();
	}

	public static void main(String[] args) {

	}
}
