package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="User")
public class User {
    @Column(name= "userid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;

    @Column(name="centerid", length = 50 ,nullable = false, unique = true)
    private int centerid;

    @Column(name = " userGradeid",nullable = false )
    private int userGradeid;

    @Column(name="userName", length = 50 ,nullable = false, unique = true)
    private String userName;
    @Column(name="fullName", length = 50 ,nullable = false, unique = true)
    private String fullName;
    @Column(name="password", length = 50 ,nullable = false, unique = true)
    private String password;
    @Column(name="codingLanguage", length = 50 ,nullable = false, unique = true)
    private String codingLanguage;
    @Column(name="email", length = 50 ,nullable = false, unique = true)
    private String email;

    public User() {
    }

    public User(int userid, int centerid, int userGradeid, String userName, String fullName, String password, String codingLanguage, String email) {
        this.userid = userid;
        this.centerid = centerid;
        this.userGradeid = userGradeid;
        this.userName = userName;
        this.fullName = fullName;
        this.password = password;
        this.codingLanguage = codingLanguage;
        this.email = email;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getCenterid() {
        return centerid;
    }

    public void setCenterid(int centerid) {
        this.centerid = centerid;
    }

    public int getUserGradeid() {
        return userGradeid;
    }

    public void setUserGradeid(int userGradeid) {
        this.userGradeid = userGradeid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCodingLanguage() {
        return codingLanguage;
    }

    public void setCodingLanguage(String codingLanguage) {
        this.codingLanguage = codingLanguage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "user{" +
                "userid=" + userid +
                ", centerid=" + centerid +
                ", userGradeid=" + userGradeid +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                ", codingLanguage='" + codingLanguage + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
