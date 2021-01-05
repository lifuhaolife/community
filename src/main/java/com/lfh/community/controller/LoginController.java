package com.lfh.community.controller;

import com.lfh.community.entity.Proprietor;
import com.lfh.community.entity.User;
import com.lfh.community.result.Result;
import com.lfh.community.result.ResultFactory;
import com.lfh.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/12/28  14:11
 */
@CrossOrigin
@RestController
public class LoginController {


    @Autowired
    UserService userService;

    /**
     * 用户登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    public Result accountLogin(@RequestBody User user){
        Integer roomId = user.getRoomId();
        String password = user.getPassword();
        User userDB = userService.findUserByRoomId(roomId);
        Integer roomIdDB = userDB.getRoomId();
        String passwordDB = userDB.getPassword();
        if (roomId == null){
            return ResultFactory.buildFailResult("用户名为空");
        }
        else if ( roomId.equals(roomIdDB) & password.equals(passwordDB)){
            return ResultFactory.buildResult(200,"登陆成功",userDB);
        }
        return ResultFactory.buildFailResult("用户名或密码错误");
    }


}
