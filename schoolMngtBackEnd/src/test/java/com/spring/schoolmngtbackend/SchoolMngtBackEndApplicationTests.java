package com.spring.schoolmngtbackend;

import com.spring.schoolmngtbackend.bean.Administrator;
import com.spring.schoolmngtbackend.bean.Instructor;
import com.spring.schoolmngtbackend.controller.AdminController;
import com.spring.schoolmngtbackend.dto.AdministratorDto;
import com.spring.schoolmngtbackend.repo.AdministratorRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE )
@Rollback(false)
//@SpringBootTest
class SchoolMngtBackEndApplicationTests {

    @Autowired
    private AdministratorRepo repo;


    @Autowired
    private AdminController controller;

    @Test
    void contextLoads() {
    }


        @Test
        public  void testCreateAdmin (){
        AdministratorDto newAdmin = new AdministratorDto("hdhshd","fhfssss","djjjdj","jfj", null,"sllsls", null,null,null,null);
      //  AdministratorDto newAdmin2 = new AdministratorDto("hdhshd","fhfssss","djjjdj","jfj", null,"sllsls", null,null,null,null);
        Administrator savedAdmin = controller.create(newAdmin);

        assertNotNull(savedAdmin);

    }

    public void testController () {

    }

}
