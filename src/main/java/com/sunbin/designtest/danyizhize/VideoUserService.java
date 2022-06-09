package com.sunbin.designtest.danyizhize;

public class VideoUserService {
    public void serverGrade(String userType) {
        if ("vip会员".equals(userType)) {
            System.out.println("vip会员，视频1080p蓝光");
        } else if ("普通会员".equals(userType)) {
            System.out.println("普通会员，视频720p超清");
        } else if ("访客用户".equals(userType)) {
            System.out.println("访客用户，视频480p高清");
        }
    }
}
