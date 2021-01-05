package com.lfh.community.service;

import com.lfh.community.entity.FamilyMember;

import java.util.List;

/**
 * @Description:
 * @author: LFH
 * @date: 2021/1/4  15:02
 */
public interface FamilyMemberService {


    //增加成员信息
    void addFamilyMember( FamilyMember familyMember);

    //根据roomId来查询成员信息
    List<FamilyMember> findMembersByRoomId(Integer roomId);
}
