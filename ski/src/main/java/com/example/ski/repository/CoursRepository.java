package com.example.ski.repository;


import com.example.ski.entity.Cours;
import com.example.ski.entity.Support;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Type;
import java.util.List;

@Repository
public interface CoursRepository extends JpaRepository<Cours,Integer> {
    List <Cours> findAllByTypeCoursAndSupport(Type tc, Support s);
    List <Cours> findAllByPrixLessThan(Float p);
    List <Cours> findAllByNiveau(int n);
}
