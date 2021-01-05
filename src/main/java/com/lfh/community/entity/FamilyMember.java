package com.lfh.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/12/28  14:24
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "member")
public class FamilyMember {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    //户号
    private Integer roomId;
    //户主
    private String manName;
    //关系
    private String relationship;
    //性别
    private String gender;


    public FamilyMember(Integer roomId, String manName, String relationship, String gender) {
        this.roomId = roomId;
        this.manName = manName;
        this.relationship = relationship;
        this.gender = gender;
    }
}
