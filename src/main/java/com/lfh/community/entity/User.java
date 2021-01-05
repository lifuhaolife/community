package com.lfh.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/12/30  11:04
 */

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    //room _id
    private Integer roomId;
    private String password;

    public User(Integer roomId, String password) {
        this.roomId = roomId;
        this.password = password;
    }
}
