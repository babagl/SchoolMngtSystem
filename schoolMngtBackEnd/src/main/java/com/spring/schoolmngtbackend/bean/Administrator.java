package com.spring.schoolmngtbackend.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "administrator")
@Data
@AllArgsConstructor
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAdministrator;
    @Column(name = "fullname")
    private String fullName;
    @Column(name = "username",unique = true)
    private String userName;
    @Column(name = "email")
    private String Email;
    @Column(name = "password")
    private String password;
    @Column(name = "Birthday")
    private LocalDate Birthday;
    @Column(name = "address")
    private String address;
    @OneToMany(
            cascade = CascadeType.DETACH
    )
    List<Instructor> instructors;
    @OneToMany(cascade = CascadeType.DETACH)
    List<TimeTable> timeTables;
    @OneToMany(cascade = CascadeType.DETACH)
    List<Students> students;
    @OneToMany
    List<Staff> staff;

    public Administrator() {
    }
}
