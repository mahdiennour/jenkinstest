package com.example.ski.controller;

import com.example.ski.entity.Cours;
import com.example.ski.service.ICoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Cours")
public class CoursRestController {
    @Autowired
    ICoursService CoursService;
    // http://localhost:8089/ski/piste/retrieve-all-pistes
    @GetMapping("/retrieve-all-Cours")
    public List<Cours> getPistes() {
        List<Cours> listCourss = CoursService.retrieveAllCours();
        return listCourss;
    }
    // http://localhost:8089/SpringMVC/piste/retrieve-piste/8
    @GetMapping("/retrieve-Cours/{abonnment-id}")
    public Cours retrieveCours(@PathVariable("Cours-id") Integer proejtId) {
        Cours Cours = CoursService.retrieveCours(proejtId);
        return Cours;
    }

    // http://localhost:8089/SpringMVC/piste/add-piste
    @PostMapping("/add-Cours")
    public Cours addCours(@RequestBody Cours p) {
        Cours Cours = CoursService.addCours(p);
        return Cours;
    }
    // http://localhost:8089/SpringMVC/piste/remove-piste/{piste-id}
    @DeleteMapping("/remove-Cours/{Cours-id}")
    public void removeCours(@PathVariable("Cours-id") Integer proejtId) {
        CoursService.removeCours(proejtId);
    }
    // http://localhost:8089/SpringMVC/piste/modify-piste
    @PutMapping("/modify-Cours")
    public Cours modifyCours(@RequestBody Cours p) {
        Cours Cours = CoursService.modifyCours(p);
        return Cours;
    }
}

