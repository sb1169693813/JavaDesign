package com.sunbin.designtest.liShiTihuanYuanZe;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
public class CreditCard extends CashCard {
    /**
     * 提现
     *
     * @param orderId 单号
     * @param amount 金额
     * @return 状态码 0000成功 0001失败 0002重复
     */
    @Override
    public String withdrawal(String orderId, BigDecimal amount) {
        //校验
        if (amount.compareTo(new BigDecimal(1000)) >= 0) {
            log.info("贷款金额校验（限额1000元），单号:{},金额:{}", orderId, amount);
            return "0001";
        }
        //模拟生成贷款单
        log.info("生成贷款单，单号:{},金额:{}", orderId, amount);
        //模拟支付成功
        log.info("贷款成功，单号:{},金额:{}", orderId, amount);
        return "0000";
    }

    /**
     * 储存
     *
     * @param orderId
     * @param amount
     * @return
     */
    @Override
    public String recharge(String orderId, BigDecimal amount) {
        //模拟生成还款单
        log.info("生成还款单，单号:{},金额:{}", orderId, amount);
        //模拟还款成功
        log.info("还款成功，单号:{},金额:{}", orderId, amount);
        return "0000";
    }

    @Override
    public List<String> tradeFlow() {
        return super.tradeFlow();
    }
}
