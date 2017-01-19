package com.patrick.testretrofit.bean;

/**
 * Created by Jolly on 2016/12/20.
 */

public class MyOrderBean extends MessageBean {

    /**
     * type : 2
     * order_num : wd_5858cb95b5ef1378987986
     * remark : 武钢股份(600005)哈哈哈哈哈哈
     * order_title : 提问
     * money : 5.00
     */

    private int type; // type 1 待支付 2 已支付  3  取消支付
    private String order_num;
    private String remark;
    private String order_title;
    private String money;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrder_title() {
        return order_title;
    }

    public void setOrder_title(String order_title) {
        this.order_title = order_title;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "MyOrderBean{" +
                "type=" + type +
                ", order_num='" + order_num + '\'' +
                ", remark='" + remark + '\'' +
                ", order_title='" + order_title + '\'' +
                ", money='" + money + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
