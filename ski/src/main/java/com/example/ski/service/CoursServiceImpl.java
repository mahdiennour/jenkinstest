package com.example.ski.service;

import com.example.ski.entity.Cours;
import com.example.ski.repository.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursServiceImpl implements ICoursService {
    @Autowired
    CoursRepository CoursRepository;

    public List<Cours> retrieveAllCours() {
       return CoursRepository.findAll();
    }

    public Cours retrieveCours(Integer idCours) {
        return CoursRepository.findById(idCours).get();
    }

    public Cours addCours(Cours p) {
        return CoursRepository.save(p);
    }

    public void removeCours(Integer idCours) {
        CoursRepository.deleteById(idCours);
    }

    public Cours modifyCours(Cours Cours) {
        return CoursRepository.save(Cours);
    }

}
