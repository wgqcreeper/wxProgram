package com.tencent.wxcloudrun.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {
    private long id;
    private String name;
    private String nickname;
    private String password;
    private String gender;
    private int age;
    private Long phone;

    private String description;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp createTime;

    private int loginStatus;

    private String identity;

    private String avatar;
}
