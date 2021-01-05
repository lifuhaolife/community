package com.lfh.community.repository;

import com.lfh.community.entity.Proprietor;
import com.lfh.community.entity.vo.ViewInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @Description:
 * @author: LFH
 * @date: 2021/1/4  10:38
 */
public interface ProprietorRepository extends JpaRepository<Proprietor,Integer> {

//    //自定义查询
//    @Query(value = "SELECT new com.lfh.community.entity.vo.ViewInfo(u, p) FROM User u, Proprietor p WHERE u.id = p.id")
//    List<ViewInfo> findViewInfo();

    //返回业主的个人信息
    Proprietor findProprietorByRoomId(Integer roomId);

    //删除用户
    void delete(Proprietor proprietor);
}
