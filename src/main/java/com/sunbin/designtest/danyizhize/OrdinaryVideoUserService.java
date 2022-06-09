package com.sunbin.designtest.danyizhize;

public class OrdinaryVideoUserService implements IVideoUserService{
    @Override
    public void definition() {
        System.out.println("普通会员，720p高清视频");
    }

    @Override
    public void advertisement() {
        System.out.println("普通会员，视频有广告");
    }
}
