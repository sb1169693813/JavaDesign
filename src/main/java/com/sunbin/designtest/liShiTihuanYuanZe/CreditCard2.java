package com.sunbin.designtest.liShiTihuanYuanZe;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
public class CreditCard2 extends CashCard2 {
    public CreditCard2(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    boolean rule2(BigDecimal amount) {
        return amount.compareTo(new BigDecimal(1000)) <= 0;
    }
    /**
     * 提现,用户卡贷款
     *
     * @param orderId 单号
     * @param amount 金额
     * @return 状态码 0000成功 0001失败 0002重复
     */
    public String loan(String orderId, BigDecimal amount) {
        boolean rule = this.rule2(amount);
        if (!rule) {
            log.info("生成贷款单失败，金额超限，单号:{},金额:{}", orderId, amount);
            return "0001";
        }

        //模拟生成贷款单
        log.info("生成贷款单，单号:{},金额:{}", orderId, amount);
        //模拟支付成功
        log.info("贷款成功，单号:{},金额:{}", orderId, amount);
        return super.negative(orderId, amount);
    }

    /**
     * 还款，信用卡还款
     *
     * @param orderId
     * @param amount
     * @return
     */
    public String repayment(String orderId, BigDecimal amount) {

        //模拟生成还款单
        log.info("生成还款单，单号:{},金额:{}", orderId, amount);
        //模拟还款成功
        log.info("还款成功，单号:{},金额:{}", orderId, amount);
        return super.positive(orderId, amount);
    }

    @Override
    public List<String> tradeFlow() {
        return super.tradeFlow();
    }
}
