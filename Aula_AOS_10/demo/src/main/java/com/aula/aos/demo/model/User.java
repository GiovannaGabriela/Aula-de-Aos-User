package com.aula.aos.demo.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

@Data
@Entity
public class User {
   @Id
   @GeneratedValue
   private Long id;

   private String username;
   private String password;
   private String email;
   private String cpf;
   private String address;
   private Short age;

}
