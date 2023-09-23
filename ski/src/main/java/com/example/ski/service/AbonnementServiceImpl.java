package com.example.ski.service;

import com.example.ski.entity.Abonnement;
import com.example.ski.entity.Piste;
import com.example.ski.repository.AbonnementRepository;
import com.example.ski.repository.PisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service
    public class AbonnementServiceImpl implements IAbonnementService {
        @Autowired
        AbonnementRepository abonnementRepository;

        public List<Abonnement> retrieveAllAbonnement() {
            return abonnementRepository.findAll();
        }

        public Abonnement retrieveAbonnement(Integer IdAbonnement) {
            return abonnementRepository.findById(IdAbonnement).get();
        }

        public Abonnement addAbonnement(Abonnement ab) {
            return abonnementRepository.save(ab);
        }

        public void removeAbonnement(Integer IdAbonnement) {
            abonnementRepository.deleteById(IdAbonnement);
        }

        public Abonnement modifyAbonnement(Abonnement abonnement) {
            return abonnementRepository.save(abonnement);
        }

    }

