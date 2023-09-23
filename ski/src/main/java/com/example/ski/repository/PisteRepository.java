package com.example.ski.repository;

import com.example.ski.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface PisteRepository extends JpaRepository<Piste,Integer> {

    List<Piste> findAllByPenteLessThanAndLongeurGreaterThan(Integer p, Integer l);

}