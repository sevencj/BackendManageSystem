package com.scorpio.example.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    private Integer userId;
    private String username;
    private String password;
    private String nickName;
    @JsonProperty("role_id")
    private Integer roleId;
    @JsonProperty("create_time")
    private Date createTime;
    @JsonProperty("update_time")
    private Date updateTime;
    private Integer delete_status;

}
