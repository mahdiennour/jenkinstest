package com.example.ski.service;

import com.example.ski.entity.Skieur;
import com.example.ski.repository.SkiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkieurServiceImpl implements ISkieurService {
    @Autowired
    SkiRepository SkieurRepository;

    public List<Skieur> retrieveAllSkieur() {
       return SkieurRepository.findAll();
    }

    public Skieur retrieveSkieur(Integer idSkieur) {
        return SkieurRepository.findById(idSkieur).get();
    }

    public Skieur addSkieur(Skieur p) {
        return SkieurRepository.save(p);
    }

    public void removeSkieur(Integer idSkieur) {
        SkieurRepository.deleteById(idSkieur);
    }

    public Skieur modifySkieur(Skieur Skieur) {
        return SkieurRepository.save(Skieur);
    }

}
