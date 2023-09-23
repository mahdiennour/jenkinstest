package com.example.ski.service;

import com.example.ski.entity.Moniteur;
import com.example.ski.entity.Piste;

import java.util.List;


public interface IMonitorService {
    public List<Moniteur> retrieveAllMonitors();
    public Moniteur retrieveMoniteur(Integer idMoniteur);
    public Moniteur addMoniteur(Moniteur p);
    public void removeMoniteur(Integer idMoniteur);
    public Moniteur modifyMoniteur(Moniteur Moniteur);
// Here we will add later methods calling keywords and methods calling JPQL
}
