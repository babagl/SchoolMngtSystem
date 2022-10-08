package com.spring.schoolmngtbackend.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "instructor")
@Data
@AllArgsConstructor
public class Instructor {
    @Id
    @Column(name = "idInstructor")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idInstructor;
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
    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.MERGE}
    )
            @JoinTable(
                    name = "instructor_timeTable",
                    joinColumns = @JoinColumn(name = "idInstructor"),
                    inverseJoinColumns = @JoinColumn(name = "idTimeTable")
            )
    List<TimeTable> timeTables;

    public Instructor() {

    }
}
