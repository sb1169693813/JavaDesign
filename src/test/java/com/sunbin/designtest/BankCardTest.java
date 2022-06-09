package com.sunbin.designtest;

import com.sunbin.designtest.liShiTihuanYuanZe.CashCard2;
import com.sunbin.designtest.liShiTihuanYuanZe.CreditCard2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class BankCardTest {
    @Test
    public void cashCardTest() {
        CashCard2 cashCard2 = new CashCard2("6877868676", "2020-10-01");
        //提现
        cashCard2.withdrawal("0001", new BigDecimal(1000));
        //储存
        cashCard2.recharge("0001", new BigDecimal(2000));
    }

    @Test
    public void creditCardTest() {
        CreditCard2 cashCard2 = new CreditCard2("1111111", "2020-10-02");
        //提现
        cashCard2.loan("000222", new BigDecimal(1000));
        //储存
        cashCard2.repayment("000212", new BigDecimal(2000));
    }
}
