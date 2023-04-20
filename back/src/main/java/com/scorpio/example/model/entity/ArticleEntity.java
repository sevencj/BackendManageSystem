package com.scorpio.example.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(indexName = "article")
public class ArticleEntity {
    @Id
    private Integer id;
    @Field(type = FieldType.Text)
    private String content;
    @Field(type = FieldType.Date)
    @JsonProperty("create_time")
    private String createTime;
    @Field(type = FieldType.Date)
    @JsonProperty("update_time")
    private String updateTime;
    @Field(type = FieldType.Integer)
    private Integer delete_status;

}
