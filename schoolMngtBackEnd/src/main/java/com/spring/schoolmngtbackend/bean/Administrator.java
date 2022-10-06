package com.spring.schoolmngtbackend.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "administrator")
@Data
@AllArgsConstructor
public class Administrator {
    @Id
    private long idAdministrator;
    private String fullName;
    private String userName;
    private String Email;
    private String password;
    private LocalDate Birthday;
    private String address;

    public Administrator() {
    }
}
