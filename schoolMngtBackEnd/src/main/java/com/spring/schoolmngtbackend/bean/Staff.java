package com.spring.schoolmngtbackend.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "staff")
@Data
@AllArgsConstructor
public class Staff {
    @Id
    @Column(name = "idStaff")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idStaff;
    @Column(name = "fullname")
    private String fullName;
    @Column(name = "userName",unique = true)
    private String userName;
    @Column(name = "email")
    private String Email;
    @Column(name = "password")
    private String password;
    @Column(name = "birthday")
    private LocalDate Birthday;
    @Column(name = "address")
    private String address;

    public Staff() {

    }
}
