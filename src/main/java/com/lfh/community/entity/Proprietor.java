package com.lfh.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/12/28  14:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "proprietor")
public class Proprietor {

//    //业主姓名
//    private String proprietorName;
//    //微信信息
//    private String wechatNumber;
//    //密码
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    //户号
    private Integer roomId;
    //业主名
    private String username;
    //性别
    private String gender;
    //手机号
    private String tel;
    //微信号
    private String wechat;
    //住宅面积
    private Double area;
    //车位号
    private String carport;
    //入户日期
    private Date date;

    public Proprietor(Integer roomId, String username, String gender,
                      String tel, String wechat, Double area, String carport, Date date) {
        this.roomId = roomId;
        this.username = username;
        this.gender = gender;
        this.tel = tel;
        this.wechat = wechat;
        this.area = area;
        this.carport = carport;
        this.date = date;
    }

    @Override
    public String toString() {
        return
                " roomId=" + roomId +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", tel='" + tel + '\'' +
                ", wechat='" + wechat + '\'' +
                ", area=" + area +
                ", carport='" + carport + '\'' +
                ", date=" + date ;
    }
}
