package com.scorpio.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.scorpio.example.service.ArticleService;
import com.scorpio.example.util.CommonUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @description: 文章相关Controller
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	/**
	 * 查询文章列表
	 */

	@RequiresPermissions("article:list")
	@GetMapping("/listArticle")
	// TODO: 3/21/2023 这里可以只接收前端传回来的pageNum 和  pageRow(pageSize)
	public JSONObject listArticle(HttpServletRequest request) {
		return articleService.listArticle(CommonUtil.request2Json(request));
	}

	/**
	 * 新增文章
	 */
	@RequiresPermissions("article:add")
	@PostMapping("/addArticle")
	// TODO: 3/21/2023 前端传id和content
	public JSONObject addArticle(@RequestBody JSONObject requestJson) {
		// 一般前端验证必填字段，这里后端做了验证处理
		CommonUtil.hasAllRequired(requestJson, "content");
		return articleService.addArticle(requestJson);
	}

	/**
	 * 修改文章
	 */
	@RequiresPermissions("article:update")
	@PostMapping("/updateArticle")
	public JSONObject updateArticle(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "id,content");
		return articleService.updateArticle(requestJson);
	}

	/**
	 * 删除文章
	 */
//	@RequiresPermissions("article:delete")
	@PostMapping("/removeArticle")
	public JSONObject removeArticle(@RequestParam Integer id) {

		return articleService.removeArticle(id);
	}
}
