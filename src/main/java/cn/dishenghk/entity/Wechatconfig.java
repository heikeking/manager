package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Wechatconfig {
    private Integer id;
    private String appId;
    private String appSecret;
    private String mchId;
    private String key;
    private String notifyUrl;
    private String token;
    private String weChatTempSuccessId;
    private String weChatTempAbnormalId;
    private String ip;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "AppId")
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "AppSecret")
    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    @Basic
    @Column(name = "MchId")
    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    @Basic
    @Column(name = "Key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Basic
    @Column(name = "NotifyUrl")
    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    @Basic
    @Column(name = "Token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "WeChatTempSuccessId")
    public String getWeChatTempSuccessId() {
        return weChatTempSuccessId;
    }

    public void setWeChatTempSuccessId(String weChatTempSuccessId) {
        this.weChatTempSuccessId = weChatTempSuccessId;
    }

    @Basic
    @Column(name = "WeChatTempAbnormalId")
    public String getWeChatTempAbnormalId() {
        return weChatTempAbnormalId;
    }

    public void setWeChatTempAbnormalId(String weChatTempAbnormalId) {
        this.weChatTempAbnormalId = weChatTempAbnormalId;
    }

    @Basic
    @Column(name = "Ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wechatconfig that = (Wechatconfig) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;
        if (appSecret != null ? !appSecret.equals(that.appSecret) : that.appSecret != null) return false;
        if (mchId != null ? !mchId.equals(that.mchId) : that.mchId != null) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        if (notifyUrl != null ? !notifyUrl.equals(that.notifyUrl) : that.notifyUrl != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (weChatTempSuccessId != null ? !weChatTempSuccessId.equals(that.weChatTempSuccessId) : that.weChatTempSuccessId != null)
            return false;
        if (weChatTempAbnormalId != null ? !weChatTempAbnormalId.equals(that.weChatTempAbnormalId) : that.weChatTempAbnormalId != null)
            return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        result = 31 * result + (appSecret != null ? appSecret.hashCode() : 0);
        result = 31 * result + (mchId != null ? mchId.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (notifyUrl != null ? notifyUrl.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (weChatTempSuccessId != null ? weChatTempSuccessId.hashCode() : 0);
        result = 31 * result + (weChatTempAbnormalId != null ? weChatTempAbnormalId.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        return result;
    }
}
