package com.lfh.community.service;

import com.lfh.community.entity.Proprietor;
import com.lfh.community.repository.ProprietorRepository;
import com.lfh.community.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Description:
 * @author: LFH
 * @date: 2021/1/4  14:35
 */
@Service
public class ProproietorServiceImpl implements ProprietorService {

    @Autowired
    ProprietorRepository proprietorRepository;




    @Override
    public void addUserInfo(Proprietor proprietor) {
        proprietorRepository.save(proprietor);
    }

    @Override
    public void updatewechat(Proprietor proprietor, String wechat) {
        proprietor.setWechat(wechat);
        proprietorRepository.save(proprietor);
    }

    @Override
    public void updateTel(Proprietor proprietor,String tel) {
        proprietor.setTel(tel);
        proprietorRepository.save(proprietor);
    }

    @Override
    public Proprietor findProprietorByRoomId(Integer roomId) {
        return proprietorRepository.findProprietorByRoomId(roomId);
    }

    @Override
    public void delete(Proprietor proprietor) {
        proprietorRepository.delete(proprietor);
    }


}
