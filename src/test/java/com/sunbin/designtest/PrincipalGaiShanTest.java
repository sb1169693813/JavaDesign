package com.sunbin.designtest;

import com.sunbin.designtest.diMiTe.Principal;
import com.sunbin.designtest.diMiTe.PrincipalGaiShan;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
public class PrincipalGaiShanTest {

    @Test
    public void test_principal() {
        PrincipalGaiShan principal = new PrincipalGaiShan();
        Map<String, Object> result = principal.queryClazzInfo();
        System.out.println(result);
    }
}
