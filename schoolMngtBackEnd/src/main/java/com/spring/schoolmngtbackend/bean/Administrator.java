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
    @Column(name = "fullName")
    private String fullName;
    @Column(name = "userName",unique = true)
    private String userName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "birthday")
    private LocalDate birthday;
    @Column(name = "address")
    private String address;

    @Enumerated(EnumType.STRING)
    private Roles roles;
    @OneToMany(cascade = CascadeType.DETACH)
    List<Instructor> instructors;
    @OneToMany(cascade = CascadeType.DETACH)
    List<TimeTable> timeTables;
    @OneToMany(cascade = CascadeType.DETACH)
    List<Students> students;
    @OneToMany(cascade = CascadeType.DETACH)
    List<Staff> staff;

    public Administrator() {
    }

    public Administrator(String fullName, String userName, String email, String password, LocalDate birthday, String address, Roles roles, List<Instructor> instructors, List<TimeTable> timeTables, List<Students> students, List<Staff> staff) {
        this.fullName = fullName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.address = address;
        this.roles = roles;
        this.instructors = instructors;
        this.timeTables = timeTables;
        this.students = students;
        this.staff = staff;
    }
}
