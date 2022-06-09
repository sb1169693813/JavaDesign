package com.sunbin.designtest;

import com.sunbin.designtest.diMiTe.Principal;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
public class PrincipalTest {

    @Test
    public void test_principal() {
        Principal principal = new Principal();
        Map<String, Object> result = principal.queryClazzInfo();
        System.out.println(result);
    }
}
