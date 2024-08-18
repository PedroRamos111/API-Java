package com.estudo.alarme.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudo.alarme.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
