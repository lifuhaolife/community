package com.lfh.community.controller;

import com.lfh.community.entity.FamilyMember;
import com.lfh.community.result.Result;
import com.lfh.community.result.ResultFactory;
import com.lfh.community.service.FamilyMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @author: LFH
 * @date: 2021/1/5  9:40
 */
@CrossOrigin
@RestController
public class FamilyMemberController {

    @Autowired
    FamilyMemberService familyMemberService;

    /**
     * 添加用户
     * @param familyMember
     * @return
     */
    @PostMapping("/mem")
    public Result addFamilyMember(@RequestBody FamilyMember familyMember){
        familyMemberService.addFamilyMember(familyMember);
        return ResultFactory.buildSuccessResult("添加业主成员成功");
    }

    /**
     * 查询业主成员信息
     * @param roomId
     * @return
     */
    @GetMapping("/mem")
    public Result findMembersByRoomId(Integer roomId){
        if (roomId == null){
            return ResultFactory.buildFailResult("roomId为空");
        }
        List<FamilyMember> members = familyMemberService.findMembersByRoomId(roomId);
        for (FamilyMember familyMember : members){
            System.out.println(familyMember.toString());
        }
        return ResultFactory.buildResult(200,"业主成员信息",members);
    }
}
