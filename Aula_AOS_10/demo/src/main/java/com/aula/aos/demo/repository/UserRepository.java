package com.aula.aos.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula.aos.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    public User findByUsernameAndPassword(String username,String password);
}
