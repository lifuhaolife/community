package com.lfh.community.repository;

import com.lfh.community.entity.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description:
 * @author: LFH
 * @date: 2021/1/4  14:31
 */
public interface FamilyMemberRepository  extends JpaRepository<FamilyMember,Integer> {


    List<FamilyMember> findFamilyMembersByRoomId(Integer roomId);
}

