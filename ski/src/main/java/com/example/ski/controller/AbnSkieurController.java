package com.example.ski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ski.entity.Skieur;
import com.example.ski.service.ISkieurAbnService;

import java.util.List;

@RestController
@RequestMapping("/abonnements-skieurs")
public class AbnSkieurController {
    @Autowired
    ISkieurAbnService SAserv;
    //http://localhost:8089/kaddem/projet/affecter-projet-detail-a-projet/1/1
    @PutMapping("/affectABNtoSkieur/{Skieur-id}/{Abn-id}")
    public void affectABNtoSkieur(@PathVariable("Skieur-id") int SI, @PathVariable("Abn-id") int AI) {
        SAserv.AffectSkieurAbn(SI, AI);
    }
    @PutMapping("/DesaffectSkieurAbn/{Skieur-id}")
    public void DesaffectSkieurAbn(@PathVariable("Skieur-id") int SI) {
        SAserv.DesafecterSkieurAbn(SI);
    }
    //http://localhost:8089/kaddem/projet/affecter-projet-detail-a-projet/1/1
    @PostMapping("/createSkieuraffectAbn/{Abn-id}")
    public void createSkieuraffectAbn(@RequestBody Skieur S, @PathVariable("Abn-id") int AI) {
        SAserv.CreateSkieurAffectAbn(S, AI);
    }
    // http://localhost:8089/ski/piste/add-skieur
    @PostMapping("/add-skieur-and-abn")
    public Skieur addSkieurAbn(@RequestBody Skieur s ) {
        Skieur C= SAserv.addSkieurandAbonnementAffect(s);
        return C;
    }
}
