package com.example.ski.controller;

import com.example.ski.entity.Abonnement;
import com.example.ski.entity.Piste;
import com.example.ski.service.IAbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/abonnement")
    public class AbonnementRestController {
        @Autowired
        IAbonnementService abonnementService;
        // http://localhost:8089/ski/piste/retrieve-all-pistes
        @GetMapping("/retrieve-all-abonnments")
        public List<Abonnement> getPistes() {
            List<Abonnement> listAbonnements = abonnementService.retrieveAllAbonnement();
            return listAbonnements;
        }
        // http://localhost:8089/SpringMVC/piste/retrieve-piste/8
        @GetMapping("/retrieve-abonnments/{abonnment-id}")
        public Abonnement retrieveAbonnement(@PathVariable("abonnement-id") Integer proejtId) {
            Abonnement abonnement = abonnementService.retrieveAbonnement(proejtId);
            return abonnement;
        }

        // http://localhost:8089/SpringMVC/piste/add-piste
        @PostMapping("/add-abonnement")
        public Abonnement addAbonnement(@RequestBody Abonnement ab) {
            Abonnement abonnement = abonnementService.addAbonnement(ab);
            return abonnement;
        }
        // http://localhost:8089/SpringMVC/piste/remove-piste/{piste-id}
        @DeleteMapping("/remove-abonnement/{abonnement-id}")
        public void removeAbonnement(@PathVariable("abonnement-id") Integer proejtId) {
            abonnementService.removeAbonnement(proejtId);
        }
        // http://localhost:8089/SpringMVC/piste/modify-piste
        @PutMapping("/modify-abonnement")
        public Abonnement modifyAbonnement(@RequestBody Abonnement ab) {
            Abonnement abonnement = abonnementService.modifyAbonnement(ab);
            return abonnement;
        }
    }

