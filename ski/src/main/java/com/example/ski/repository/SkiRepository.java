package com.example.ski.repository;

import com.example.ski.entity.Skieur;
import com.example.ski.entity.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkiRepository extends JpaRepository<Skieur,Integer> {
    List <Skieur> findAllByAbonnement_TypeAbo(TypeAbonnement ta);
    @Query("Select s From Skieur s where s.abonnement.typeAbo = :ta")
    List <Skieur> recupererSkieurParTypeAbonnement(@Param("ta") TypeAbonnement ta);
}
