package com.lfh.community.controller;

import com.lfh.community.entity.Proprietor;
import com.lfh.community.result.Result;
import com.lfh.community.result.ResultFactory;
import com.lfh.community.service.ProprietorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @author: LFH
 * @date: 2021/1/5  9:41
 */

@CrossOrigin
@RestController
public class ProPrietorController {


    @Autowired
    ProprietorService proprietorService;

    /**
     * 通过户号，查询户主信息
     * @param roomId
     * @return
     */
    @GetMapping("/pro")
    public Result findProprietorByRoomId(@RequestParam Integer roomId){
        Proprietor proprietor = proprietorService.findProprietorByRoomId(roomId);
        return ResultFactory.buildSuccessResult(proprietor);
    }

    /**
     * 增加或者修改用户信息
     * @param proprietor
     * @return
     */
    @PostMapping("/pro")
    public Result addUserInfo(@RequestBody Proprietor proprietor){
        proprietorService.addUserInfo(proprietor);
        return ResultFactory.buildSuccessResult("成功增加用户信息");
    }

    /**
     * 根据据用户Id修改微信号
     * @param roomId
     * @param wechat
     * @return
     */
    @GetMapping("/pro/wechat")
    public Result updateWechat(Integer roomId, String wechat){
        Proprietor proprietor = proprietorService.findProprietorByRoomId(roomId);
        proprietorService.updatewechat(proprietor,wechat);
        return ResultFactory.buildSuccessResult("修改微信号成功");
    }

    /**
     * 根据用户号修改电话号码
     * @param roomId
     * @param tel
     * @return
     */
    @GetMapping("/pro/tel")
    public Result updateTel(Integer roomId,String tel){
        Proprietor proprietor = proprietorService.findProprietorByRoomId(roomId);
        proprietorService.updateTel(proprietor,tel);
        return ResultFactory.buildSuccessResult("修改电话号码成功");
    }


    /**
     * 根据用户号进行删除用户
     * @param roomId
     * @return
     */
    @DeleteMapping("/pro")
    public Result deleteProprietor(Integer roomId){
        Proprietor proprietor = proprietorService.findProprietorByRoomId(roomId);
        proprietorService.delete(proprietor);
        return ResultFactory.buildSuccessResult("成功删除用户"+ proprietor.getRoomId());
    }
}
