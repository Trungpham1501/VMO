package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Table(name = "center")
public class Center {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long centerid;

    @Column(name = "centerName", length = 50, nullable = false)
    private String centerName;

    public Center() {
    }

    public Center(long centerid, String centerName) {
        this.centerid = centerid;
        this.centerName = centerName;
    }

    public long getCenterid() {
        return centerid;
    }

    public void setCenterid(long centerid) {
        this.centerid = centerid;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

}
