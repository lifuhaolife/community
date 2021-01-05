package com.lfh.community.service;

import com.lfh.community.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author: LFH
 * @date: 2021/1/4  15:39
 */

public interface UserService {

    //通过roomId找到用户
    User findUserByRoomId(Integer roomId);

    //用户修改密码
    User updatePassword(User user);

    //增加用户
    void addUser(User user);

    //删除所有用户
    void deleteAllUser();
}
