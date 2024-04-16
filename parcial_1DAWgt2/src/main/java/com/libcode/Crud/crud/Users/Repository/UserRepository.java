package com.libcode.Crud.crud.Users.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libcode.Crud.crud.Users.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
