package com.example.ski.repository;


import com.example.ski.entity.Moniteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoniteurRepository extends JpaRepository<Moniteur,Integer> {

}
