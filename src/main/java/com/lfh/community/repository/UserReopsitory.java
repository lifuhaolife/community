package com.lfh.community.repository;

import com.lfh.community.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/12/30  11:29
 */
public interface UserReopsitory extends JpaRepository<User,Integer> {

    User findUserById(Integer id);

    User findUserByRoomId(Integer room_id);

    //密码修改

}
