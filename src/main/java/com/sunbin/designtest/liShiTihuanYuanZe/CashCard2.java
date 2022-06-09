package com.sunbin.designtest.liShiTihuanYuanZe;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 模拟储蓄卡功能
 */
@Slf4j
public class CashCard2 extends BankCard{


    public CashCard2(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    @Override
    boolean rule(BigDecimal amount) {
        return true;
    }

    /**
     * 提现
     *
     * @param orderId 单号
     * @param amount 金额
     * @return 状态码 0000成功 0001失败 0002重复
     */
    public String withdrawal(String orderId, BigDecimal amount) {
        log.info("提现成功，单号:{},金额:{}", orderId, amount);
        return super.negative(orderId, amount);
    }

    /**
     * 储存
     *
     * @param orderId
     * @param amount
     * @return
     */
    public String recharge(String orderId, BigDecimal amount) {
        log.info("储存成功，单号:{},金额:{}", orderId, amount);
        return super.positive(orderId, amount);
    }

}
