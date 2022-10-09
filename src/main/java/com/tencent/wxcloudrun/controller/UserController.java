package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.dao.UserMapper;
import com.tencent.wxcloudrun.model.R;
import com.tencent.wxcloudrun.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/getInfo")
    public R getInfo(String phone){
        User user = userMapper.getInfo(phone);
        return R.ok().data("user",user).message("okk");
    }

}
