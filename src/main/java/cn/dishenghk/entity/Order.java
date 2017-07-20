package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Order {
    private Integer id;
    private String outTradeNo;
    private String transactionId;
    private Double money;
    private Integer status;
    private Timestamp createTime;
    private String weChatOpenId;
    private Byte notifyStatus;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "OutTradeNo")
    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    @Basic
    @Column(name = "TransactionId")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Basic
    @Column(name = "Money")
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Basic
    @Column(name = "Status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "CreateTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "WeChatOpenId")
    public String getWeChatOpenId() {
        return weChatOpenId;
    }

    public void setWeChatOpenId(String weChatOpenId) {
        this.weChatOpenId = weChatOpenId;
    }

    @Basic
    @Column(name = "NotifyStatus")
    public Byte getNotifyStatus() {
        return notifyStatus;
    }

    public void setNotifyStatus(Byte notifyStatus) {
        this.notifyStatus = notifyStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (outTradeNo != null ? !outTradeNo.equals(order.outTradeNo) : order.outTradeNo != null) return false;
        if (transactionId != null ? !transactionId.equals(order.transactionId) : order.transactionId != null)
            return false;
        if (money != null ? !money.equals(order.money) : order.money != null) return false;
        if (status != null ? !status.equals(order.status) : order.status != null) return false;
        if (createTime != null ? !createTime.equals(order.createTime) : order.createTime != null) return false;
        if (weChatOpenId != null ? !weChatOpenId.equals(order.weChatOpenId) : order.weChatOpenId != null) return false;
        if (notifyStatus != null ? !notifyStatus.equals(order.notifyStatus) : order.notifyStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (outTradeNo != null ? outTradeNo.hashCode() : 0);
        result = 31 * result + (transactionId != null ? transactionId.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (weChatOpenId != null ? weChatOpenId.hashCode() : 0);
        result = 31 * result + (notifyStatus != null ? notifyStatus.hashCode() : 0);
        return result;
    }
}
