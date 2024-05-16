package entity;

import jakarta.persistence.*;

@Table(name="role")
public class Role {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY )
    private long roleid;

    @Column(name = "rollName", length = 50, nullable = false)
    private String rollName;

    public Role() {
    }

    public Role(long roleid, String rollName) {
        this.roleid = roleid;
        this.rollName = rollName;
    }

    public long getRoleid() {
        return roleid;
    }

    public void setRoleid(long roleid) {
        this.roleid = roleid;
    }

    public String getRollName() {
        return rollName;
    }

    public void setRollName(String rollName) {
        this.rollName = rollName;
    }
}
