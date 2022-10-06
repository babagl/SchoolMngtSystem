package com.spring.schoolmngtbackend.bean;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name ="students")
@Data
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idStudent;
    @Column(name = "fullname")
    private String fullName;
    @Column(name = "userName",unique = true)
    private String userName;
    @Column(name = "password")
    private String password;
    private String Email;
    private LocalDate BirthDay;
    private String address;
    private LocalDateTime DateOfRegister;


    public Students() {

    }
}
