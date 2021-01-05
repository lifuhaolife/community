package com.lfh.community;

import com.lfh.community.entity.FamilyMember;
import com.lfh.community.entity.Proprietor;
import com.lfh.community.entity.User;
import com.lfh.community.entity.vo.ViewInfo;
import com.lfh.community.repository.FamilyMemberRepository;
import com.lfh.community.repository.ProprietorRepository;
import com.lfh.community.repository.UserReopsitory;
import com.lfh.community.service.FamilyMemberService;
import com.lfh.community.service.ProprietorService;
import com.lfh.community.service.UserService;
import com.lfh.community.utils.DateUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class CommunityApplicationTests {

    @Autowired
    FamilyMemberService familyMemberService;

    @Autowired
    ProprietorService proprietorService;

    //成员的增加删除
    @Test
    void memberService(){
//        FamilyMember familyMember = new FamilyMember(7227, "李富豪", "1号床", "男");
//        FamilyMember familyMember2 = new FamilyMember(7227, "郭超凡", "2号床", "男");
//        familyMemberService.addFamilyMember(familyMember);
//        familyMemberService.addFamilyMember(familyMember2);
        List<FamilyMember> members = familyMemberService.findMembersByRoomId(7227);
        for (FamilyMember familyMember1 : members){
            System.out.println(familyMember1.toString());
        }
    }

    @Test
    void ProprietorService(){
        //1.增加用户
        Proprietor proprietor = new Proprietor();
        proprietor.setRoomId(7227);
        proprietor.setUsername("李富豪");
        proprietor.setGender("男");
        proprietor.setTel("11");
        proprietor.setWechat("l2448808186");
        proprietor.setArea(128.75);
        proprietor.setCarport("A-128");
        Date date = new Date();
        proprietor.setDate(DateUtils.utilToSql(date));
        proprietorService.addUserInfo(proprietor);

    }

    @Test
    void findProprietor(){
        //根据roomId查询用户信息
        Proprietor proprietor = proprietorService.findProprietorByRoomId(7227);
        System.out.println(proprietor.toString());
        //修改微信
        proprietorService.updatewechat(proprietor,"lfh的微信");
        //修改手机号
        proprietorService.updateTel(proprietor,"lfh的电话");
    }

    @Test
    void deleteProprietor(){
        Proprietor proprietor = proprietorService.findProprietorByRoomId(7227);
        proprietorService.delete(proprietor);
    }




    @Autowired
    UserService userService;


    @Test
    void userTest(){

//        userService.deleteAllUser();
//        User user = new User(7227, "袁博文");
//        userService.addUser(user);
//        userService.addUser(new User(7228,"郭超凡"));
//        User user1 = userService.findUserByRoomId(7227);
//        System.out.println("7227 用户： \t "+ user1);
//        User user2 = userService.findUserByRoomId(7228);
//        System.out.println("7228 用户： \t "+ user2);
//
//        //修改密码
//        user1.setPassword("李富豪");
//        userService.updatePassword(user1);
//
//        System.out.println("7227 用户： \t "+ user1);


        userService.deleteAllUser();

    }





//    @Test
//    void userTest(){
////        User user = userReopsitory.findUserById(1);
//        User user = userReopsitory.findUserByRoomId(7227);
//        System.out.println(" 密码 \t"+user.getPassword());
//    }
//    @Test
//    void contextLoads() {
//
////        userReopsitory.save(new User("222","456"));
////        User res = userReopsitory.findUserById(6);
////        System.out.println(res.getUsername());
////        java.sql.Date date = DateUtils.utilToSql(new Date());
////        proprietorRepository.save(new Proprietor("wqq","123",));
////        proprietorRepository.save(new Proprietor("袁博文","123",date));
////        proprietorRepository.deleteById(1);
//
////        List<ViewInfo> viewInfos = proprietorRepository.findViewInfo();
//////        for (ViewInfo viewInfo : viewInfos){
//////            System.out.println(viewInfo.getProprietor());
//////            System.out.println(viewInfo.getUser());
//////        }
//    }






}
