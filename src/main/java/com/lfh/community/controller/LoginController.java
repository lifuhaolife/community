package com.lfh.community.controller;

import com.lfh.community.entity.Proprietor;
import com.lfh.community.result.Result;
import com.lfh.community.result.ResultFactory;
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

    @GetMapping("/hello")
    public String  hello(){
        System.out.println("hello");
        return "hello,world!";
    }


//    @PostMapping("/login")
//    public Result accountLogon(@RequestBody Proprietor proprietor){
//        String username = proprietor.getUsername();
//        String password = proprietor.getPassword();
//        System.out.println(username);
//        System.out.println(password);
////        return username +" :"+ password;
//        return ResultFactory.buildResult(-1,"/home/divMan","/home/divMan");
//    }


}
