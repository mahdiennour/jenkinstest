package com.example.ski.repository;


import com.example.ski.entity.Inscription;
import com.example.ski.entity.TypeCours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Type;
import java.util.List;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription,Integer> {
    List <Inscription> findAllByCours_TypeCours(TypeCours tc);
    @Query("Select i From Inscription i where i.cours.typeCours= :xyz")
    List<Inscription> recupererSkieurParTypeCours(@Param("xyz") TypeCours tc);
}
