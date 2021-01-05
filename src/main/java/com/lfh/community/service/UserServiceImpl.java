package com.lfh.community.service;

import com.lfh.community.entity.User;
import com.lfh.community.repository.UserReopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author: LFH
 * @date: 2021/1/4  15:40
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserReopsitory userReopsitory;

    @Override
    public User findUserByRoomId(Integer roomId) {
        return userReopsitory.findUserByRoomId(roomId);
    }

    @Override
    public User updatePassword(User user) {
        return userReopsitory.save(user);
    }

    @Override
    public void addUser(User user) {
        userReopsitory.save(user);
    }

    @Override
    public void deleteAllUser() {
        userReopsitory.deleteAll();
    }


}
