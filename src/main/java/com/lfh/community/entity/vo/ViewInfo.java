package com.lfh.community.entity.vo;

import com.lfh.community.entity.Proprietor;
import com.lfh.community.entity.User;
import lombok.Data;

/**
 * @Description:
 * @author: LFH
 * @date: 2021/1/4  11:06
 */
@Data
public class ViewInfo {

    private User user;

    private Proprietor proprietor;

    public ViewInfo(User user) {
        Proprietor proprietor = new Proprietor();
        this.user = user;
        this.proprietor = proprietor;
    }

    public ViewInfo(Proprietor proprietor) {
        User user = new User();
        this.user = user;
        this.proprietor = proprietor;
    }

    public ViewInfo(User user, Proprietor proprietor) {
        this.user = user;
        this.proprietor = proprietor;
    }



}
