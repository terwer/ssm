package com.terwergreen.pojo;

/**
 * @author: terwer
 * @date: 2021/12/23 21:11
 * @description:
 */
public class Account {
    private String name;
    private String money;
    private String cardNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money='" + money + '\'' +
                ", cardNo='" + cardNo + '\'' +
                '}';
    }
}
