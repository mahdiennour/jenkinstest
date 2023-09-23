package com.example.ski.service;

import com.example.ski.entity.Cours;
import com.example.ski.entity.Cours;

import java.util.List;


public interface ICoursService {
    public List<Cours> retrieveAllCours();
    public Cours retrieveCours(Integer idCours);
    public Cours addCours(Cours p);
    public void removeCours(Integer idCours);
    public Cours modifyCours(Cours cours);
// Here we will add later methods calling keywords and methods calling JPQL
}
