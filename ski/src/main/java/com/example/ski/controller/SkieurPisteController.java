package com.example.ski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ski.service.ISkieurPisteService;

import java.util.List;

@RestController
@RequestMapping("/skieurs-pistes")
public class SkieurPisteController {
    @Autowired
    ISkieurPisteService SPS;
    @PutMapping("/affecterSkieurPiste/{Skieur-id}/{Piste-id}")
    public void affectSkieurPiste(@PathVariable("Skieur-id") int SI, @PathVariable("Piste-id") int PI) {
        SPS.AffectSkieurPiste(SI, PI);
    }
    @PutMapping("/desaffecterSkieurPiste/{Skieur-id}/{Piste-id}")
    public void desaffecterSkieurPiste(@PathVariable("Skieur-id") int SI, @PathVariable("Piste-id") int PI) {
        SPS.DesAffectSkieurPiste(SI, PI);
    }
}
