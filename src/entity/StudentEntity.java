package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "student")
public class StudentEntity {

    // ID attribute
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Attribute
    @Column(name = "nic", nullable = false, length = 12)
    private String nic;

    @CreationTimestamp
    @Column(name = "create_date", nullable = false)
    private Date createDate;
}
