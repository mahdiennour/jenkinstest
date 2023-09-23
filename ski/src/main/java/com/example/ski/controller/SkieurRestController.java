package com.example.ski.controller;

import com.example.ski.entity.Skieur;
import com.example.ski.service.ISkieurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Skieur")
public class SkieurRestController {
    @Autowired
    ISkieurService SkieurService;
    // http://localhost:8089/ski/piste/retrieve-all-pistes
    @GetMapping("/retrieve-all-Skieur")
    public List<Skieur> getPistes() {
        List<Skieur> listSkieurs = SkieurService.retrieveAllSkieur();
        return listSkieurs;
    }
    // http://localhost:8089/SpringMVC/piste/retrieve-piste/8
    @GetMapping("/retrieve-Skieur/{abonnment-id}")
    public Skieur retrieveSkieur(@PathVariable("Skieur-id") Integer proejtId) {
        Skieur Skieur = SkieurService.retrieveSkieur(proejtId);
        return Skieur;
    }

    // http://localhost:8089/SpringMVC/piste/add-piste
    @PostMapping("/add-Skieur")
    public Skieur addSkieur(@RequestBody Skieur p) {
        Skieur Skieur = SkieurService.addSkieur(p);
        return Skieur;
    }
    // http://localhost:8089/SpringMVC/piste/remove-piste/{piste-id}
    @DeleteMapping("/remove-Skieur/{Skieur-id}")
    public void removeSkieur(@PathVariable("Skieur-id") Integer proejtId) {
        SkieurService.removeSkieur(proejtId);
    }
    // http://localhost:8089/SpringMVC/piste/modify-piste
    @PutMapping("/modify-Skieur")
    public Skieur modifySkieur(@RequestBody Skieur p) {
        Skieur Skieur = SkieurService.modifySkieur(p);
        return Skieur;
    }
}

