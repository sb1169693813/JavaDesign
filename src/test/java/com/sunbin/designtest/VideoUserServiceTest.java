package com.sunbin.designtest;

import com.sunbin.designtest.danyizhize.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VideoUserServiceTest {
    @Test
    public void test_serverGrade() {
        VideoUserService videoUserService = new VideoUserService();
        videoUserService.serverGrade("vip会员");
        videoUserService.serverGrade("普通会员");
        videoUserService.serverGrade("访客用户");
    }

    @Test
    public void test_good_serverGrade() {
        IVideoUserService gusetVideoUser = new GuestVideoUserService();
        gusetVideoUser.definition();
        gusetVideoUser.advertisement();

        IVideoUserService ordinaryVideoUser = new OrdinaryVideoUserService();
        ordinaryVideoUser.definition();
        ordinaryVideoUser.advertisement();

        IVideoUserService vipVideoUser = new VipVideoUserService();
        vipVideoUser.definition();
        vipVideoUser.advertisement();
    }
}
