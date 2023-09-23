package com.example.ski.controller;

import com.example.ski.entity.Inscription;
import com.example.ski.service.IInscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Inscription")
public class InscriptionRestController {
    @Autowired
    IInscriptionService InscriptionService;
    // http://localhost:8089/ski/piste/retrieve-all-pistes
    @GetMapping("/retrieve-all-Inscription")
    public List<Inscription> getPistes() {
        List<Inscription> listInscriptions = InscriptionService.retrieveAllInscription();
        return listInscriptions;
    }
    // http://localhost:8089/SpringMVC/piste/retrieve-piste/8
    @GetMapping("/retrieve-Inscription/{abonnment-id}")
    public Inscription retrieveInscription(@PathVariable("Inscription-id") Integer proejtId) {
        Inscription Inscription = InscriptionService.retrieveInscription(proejtId);
        return Inscription;
    }

    // http://localhost:8089/SpringMVC/piste/add-piste
    @PostMapping("/add-Inscription")
    public Inscription addInscription(@RequestBody Inscription p) {
        Inscription Inscription = InscriptionService.addInscription(p);
        return Inscription;
    }
    // http://localhost:8089/SpringMVC/piste/remove-piste/{piste-id}
    @DeleteMapping("/remove-Inscription/{Inscription-id}")
    public void removeInscription(@PathVariable("Inscription-id") Integer proejtId) {
        InscriptionService.removeInscription(proejtId);
    }
    // http://localhost:8089/SpringMVC/piste/modify-piste
    @PutMapping("/modify-Inscription")
    public Inscription modifyInscription(@RequestBody Inscription p) {
        Inscription Inscription = InscriptionService.modifyInscription(p);
        return Inscription;
    }
}

