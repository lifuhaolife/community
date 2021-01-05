package com.lfh.community.service;

import com.lfh.community.entity.FamilyMember;
import com.lfh.community.repository.FamilyMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @author: LFH
 * @date: 2021/1/4  15:07
 */
@Service
public class FamilyMemberServiceImpl implements FamilyMemberService {

    @Autowired
    FamilyMemberRepository familyMemberRepository;


    @Override
    public void addFamilyMember( FamilyMember familyMember) {

        familyMemberRepository.save(familyMember);
    }

    @Override
    public List<FamilyMember> findMembersByRoomId(Integer roomId) {
        return  familyMemberRepository.findFamilyMembersByRoomId(roomId);
    }
}
