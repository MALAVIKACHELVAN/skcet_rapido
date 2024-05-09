package com.example.skcet_rapido.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.skcet_rapido.model.LoginDetails;

@Repository
public interface LoginRepo extends JpaRepository<LoginDetails,String> {
   LoginDetails findByEmail(String email);
}
