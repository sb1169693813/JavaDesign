package com.sunbin.designtest.danyizhize;

public class VipVideoUserService implements IVideoUserService{
    @Override
    public void definition() {
        System.out.println("vip会员，1080p蓝光视频");
    }

    @Override
    public void advertisement() {
        System.out.println("vip会员，视频无广告");
    }
}
