package com.sunbin.designtest.danyizhize;

public class GuestVideoUserService implements IVideoUserService{
    @Override
    public void definition() {
        System.out.println("访客用户，480p高清视频");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户，视频有广告");
    }
}
