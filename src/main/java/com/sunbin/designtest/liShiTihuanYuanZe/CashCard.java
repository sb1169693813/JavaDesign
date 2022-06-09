package com.sunbin.designtest.liShiTihuanYuanZe;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 模拟储蓄卡功能
 */
@Slf4j
public class CashCard {

    /**
     * 提现
     *
     * @param orderId 单号
     * @param amount 金额
     * @return 状态码 0000成功 0001失败 0002重复
     */
    public String withdrawal(String orderId, BigDecimal amount) {
        log.info("提现成功，单号:{},金额:{}", orderId, amount);
        return "0000";
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
        return "0000";
    }

    public List<String> tradeFlow() {
        log.info("交易流水查询成功");
        List<String> tradeList = new ArrayList<>();
        tradeList.add("100001,100.00");
        tradeList.add("100001,80.00");
        tradeList.add("100001,76.50");
        tradeList.add("100001,126.00");
        return  tradeList;
    }
}
