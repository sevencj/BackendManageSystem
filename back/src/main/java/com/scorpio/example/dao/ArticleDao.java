package com.scorpio.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.scorpio.example.model.entity.ArticleEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: 文章Dao层
 */

public interface ArticleDao {
	/**
	 * 新增文章
	 */
	int addArticle(JSONObject jsonObject);

	/**
	 * 统计文章总数
	 */
	int countArticle(JSONObject jsonObject);

	/**
	 * 文章列表
	 */
	List<ArticleEntity> listArticle(JSONObject jsonObject);

	/**
	 * 更新文章
	 */
	int updateArticle(JSONObject jsonObject);


	/**
	 * 根据id删除文章
	 * @author Will
	 * @date 3/21/2023 2:26 PM
	 * @param id
	 * @return boolean
	 */
	boolean removeArticle(Integer id);

}
