package cn.dishenghk.entity;

import org.springframework.stereotype.Service;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Service
public class User {
    private Integer id;
    private String userName;
    private String email;
    private String normalizedUserName;
    private String password;
    private String passwordFormat;
    private String hashAlgorithm;
    private String passwordSalt;
    private String registrationStatus;
    private String emailStatus;
    private String emailChallengeToken;
    private Timestamp createdUtc;
    private Timestamp lastLoginUtc;
    private Timestamp lastLogoutUtc;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getNormalizedUserName() {
        return normalizedUserName;
    }

    public void setNormalizedUserName(String normalizedUserName) {
        this.normalizedUserName = normalizedUserName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordFormat() {
        return passwordFormat;
    }

    public void setPasswordFormat(String passwordFormat) {
        this.passwordFormat = passwordFormat;
    }

    public String getHashAlgorithm() {
        return hashAlgorithm;
    }

    public void setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }
    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }
    public String getEmailChallengeToken() {
        return emailChallengeToken;
    }

    public void setEmailChallengeToken(String emailChallengeToken) {
        this.emailChallengeToken = emailChallengeToken;
    }
    public Timestamp getCreatedUtc() {
        return createdUtc;
    }

    public void setCreatedUtc(Timestamp createdUtc) {
        this.createdUtc = createdUtc;
    }

    public Timestamp getLastLoginUtc() {
        return lastLoginUtc;
    }

    public void setLastLoginUtc(Timestamp lastLoginUtc) {
        this.lastLoginUtc = lastLoginUtc;
    }
    public Timestamp getLastLogoutUtc() {
        return lastLogoutUtc;
    }

    public void setLastLogoutUtc(Timestamp lastLogoutUtc) {
        this.lastLogoutUtc = lastLogoutUtc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (normalizedUserName != null ? !normalizedUserName.equals(user.normalizedUserName) : user.normalizedUserName != null)
            return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (passwordFormat != null ? !passwordFormat.equals(user.passwordFormat) : user.passwordFormat != null)
            return false;
        if (hashAlgorithm != null ? !hashAlgorithm.equals(user.hashAlgorithm) : user.hashAlgorithm != null)
            return false;
        if (passwordSalt != null ? !passwordSalt.equals(user.passwordSalt) : user.passwordSalt != null) return false;
        if (registrationStatus != null ? !registrationStatus.equals(user.registrationStatus) : user.registrationStatus != null)
            return false;
        if (emailStatus != null ? !emailStatus.equals(user.emailStatus) : user.emailStatus != null) return false;
        if (emailChallengeToken != null ? !emailChallengeToken.equals(user.emailChallengeToken) : user.emailChallengeToken != null)
            return false;
        if (createdUtc != null ? !createdUtc.equals(user.createdUtc) : user.createdUtc != null) return false;
        if (lastLoginUtc != null ? !lastLoginUtc.equals(user.lastLoginUtc) : user.lastLoginUtc != null) return false;
        if (lastLogoutUtc != null ? !lastLogoutUtc.equals(user.lastLogoutUtc) : user.lastLogoutUtc != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (normalizedUserName != null ? normalizedUserName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (passwordFormat != null ? passwordFormat.hashCode() : 0);
        result = 31 * result + (hashAlgorithm != null ? hashAlgorithm.hashCode() : 0);
        result = 31 * result + (passwordSalt != null ? passwordSalt.hashCode() : 0);
        result = 31 * result + (registrationStatus != null ? registrationStatus.hashCode() : 0);
        result = 31 * result + (emailStatus != null ? emailStatus.hashCode() : 0);
        result = 31 * result + (emailChallengeToken != null ? emailChallengeToken.hashCode() : 0);
        result = 31 * result + (createdUtc != null ? createdUtc.hashCode() : 0);
        result = 31 * result + (lastLoginUtc != null ? lastLoginUtc.hashCode() : 0);
        result = 31 * result + (lastLogoutUtc != null ? lastLogoutUtc.hashCode() : 0);
        return result;
    }
}
