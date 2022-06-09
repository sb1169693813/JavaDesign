package com.sunbin.designtest.liShiTihuanYuanZe;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public abstract class BankCard {
    //卡号
    private String cardNo;

    //开卡时间
    private String cardDate;

    public BankCard(String cardNo, String cardDate) {
        this.cardNo = cardNo;
        this.cardDate = cardDate;
    }

    abstract boolean rule(BigDecimal amount);

    //正向入账，加钱
    public String positive(String orderId, BigDecimal amount) {
        log.info("卡号：{}入款成功， 单号:{},金额:{}", cardNo, orderId, amount);
        return "0000";
    }

    //逆向入账，减钱
    public String negative(String orderId, BigDecimal amount) {
        log.info("卡号：{}出款成功， 单号:{},金额:{}", cardNo, orderId, amount);
        return "0000";
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
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
