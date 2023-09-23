package com.example.ski.controller;

import com.example.ski.entity.Piste;
import com.example.ski.service.IPisteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/piste")
    @Tag(name = "web-service piste")
    public class PisteRestController {
        @Autowired
        IPisteService pisteService;
        // http://localhost:8089/ski/piste/retrieve-all-pistes
        @GetMapping("/retrieve-all-pistes")
        public List<Piste> getPistes() {
            List<Piste> listPistes = pisteService.retrieveAllPistes();
            return listPistes;
        }
        // http://localhost:8089/SpringMVC/piste/retrieve-piste/8
        @GetMapping("/retrieve-piste/{piste-id}")
        @Operation(description = "affichage piste")
        public Piste retrievePiste(@PathVariable("piste-id") Integer proejtId) {
            Piste piste = pisteService.retrievePiste(proejtId);
            return piste;
        }

    // http://localhost:8089/SpringMVC/piste/add-piste
    @PostMapping("/add-piste")
    public Piste addPiste(@RequestBody Piste p) {
        Piste piste = pisteService.addPiste(p);
        return piste;
    }
    // http://localhost:8089/SpringMVC/piste/remove-piste/{piste-id}
    @DeleteMapping("/remove-piste/{piste-id}")
    public void removePiste(@PathVariable("piste-id") Integer proejtId) {
        pisteService.removePiste(proejtId);
    }
    // http://localhost:8089/SpringMVC/piste/modify-piste
    @PutMapping("/modify-piste")
    public Piste modifyPiste(@RequestBody Piste p) {
        Piste piste = pisteService.modifyPiste(p);
        return piste;
    }
}