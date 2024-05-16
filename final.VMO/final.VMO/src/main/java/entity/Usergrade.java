package entity;

import jakarta.persistence.*;

import java.util.Date;

@Table(name = "usergrade")
public class Usergrade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectid;

    @Column(name = "projectcode", length = 50, nullable = false)
    private String projectcode;

    @Column(name = "startDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(name = "endDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name= "codingLanguage", length = 50,nullable = false)
    private String codingLanguage;

    @Column(name= "status", length = 50,nullable = false)
    private String status;

    public Usergrade() {
    }

    public Usergrade(int projectid, String projectcode, Date startDate, Date endDate, String codingLanguage, String status) {
        this.projectid = projectid;
        this.projectcode = projectcode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.codingLanguage = codingLanguage;
        this.status = status;
    }

}
