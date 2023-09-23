package com.example.ski.service;

import com.example.ski.entity.Abonnement;
import com.example.ski.entity.Piste;

import java.util.List;

public interface IAbonnementService {
    public List<Abonnement> retrieveAllAbonnement();
    public Abonnement retrieveAbonnement(Integer IdAbonnement);
    public Abonnement addAbonnement(Abonnement ab);
    public void removeAbonnement(Integer IdAbonnement);
    public Abonnement modifyAbonnement(Abonnement abonnement);
// Here we will add later methods calling keywords and methods calling JPQL
}
