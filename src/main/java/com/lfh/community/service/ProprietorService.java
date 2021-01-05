package com.lfh.community.service;

import com.lfh.community.entity.Proprietor;
import com.lfh.community.repository.ProprietorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Description:
 * @author: LFH
 * @date: 2021/1/4  14:33
 */

@Service
public interface ProprietorService {



    //管理员 增加或修改业主信息
    void  addUserInfo(Proprietor proprietor);

    //修改微信号
    void updatewechat(Proprietor proprietor,String wechat);

    //修改手机号
    void updateTel(Proprietor proprietor,String tel);


    //业主通过roomId查询到自己的信息,登录自动获取roomId;
    Proprietor findProprietorByRoomId(Integer roomId);

    //通过用户号删除用户
    void delete(Proprietor proprietor);
}
