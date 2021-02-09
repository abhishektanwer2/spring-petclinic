package com.example.springpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPetClinicApplication {

    public static void main(String[] args) {
        System.out.println("Pet Clinic ");
        SpringApplication.run(SpringPetClinicApplication.class, args);
    }

}
