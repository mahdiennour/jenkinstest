package com.example.ski.controller;

import com.example.ski.entity.Abonnement;
import com.example.ski.entity.Moniteur;
import com.example.ski.service.IAbonnementService;
import com.example.ski.service.IMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/moniteur")
public class MoniteurRestController {
    @Autowired
    IMonitorService MoniteurService;
    // http://localhost:8089/ski/piste/retrieve-all-pistes
    @GetMapping("/retrieve-all-abonnments")
    public List<Moniteur> getPistes() {
        List<Moniteur> listMoniteurs = MoniteurService.retrieveAllMonitors();
        return listMoniteurs;
    }
    // http://localhost:8089/SpringMVC/piste/retrieve-piste/8
    @GetMapping("/retrieve-monitors/{monitor-id}")
    public Moniteur retrieveMoniteur(@PathVariable("Monitor-id") Integer proejtId) {
        Moniteur moniteur = MoniteurService.retrieveMoniteur(proejtId);
        return moniteur;
    }

    // http://localhost:8089/SpringMVC/piste/add-piste
    @PostMapping("/add-Moniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur p) {
        Moniteur moniteur = MoniteurService.addMoniteur(p);
        return moniteur;
    }
    // http://localhost:8089/SpringMVC/piste/remove-piste/{piste-id}
    @DeleteMapping("/remove-Moniteur/{Moniteur-id}")
    public void removeMoniteur(@PathVariable("Moniteur-id") Integer proejtId) {
        MoniteurService.removeMoniteur(proejtId);
    }
    // http://localhost:8089/SpringMVC/piste/modify-piste
    @PutMapping("/modify-Moniteur")
    public Moniteur modifyMoniteur(@RequestBody Moniteur p) {
        Moniteur moniteur = MoniteurService.modifyMoniteur(p);
        return moniteur;
    }
}

