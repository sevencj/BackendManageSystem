package com.scorpio.example.dao;

import com.scorpio.example.model.entity.ArticleEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArticleRepository extends ElasticsearchRepository<ArticleEntity, Long> {
}
