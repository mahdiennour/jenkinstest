package com.example.ski.service;

import com.example.ski.entity.Inscription;
import com.example.ski.entity.Piste;
import com.example.ski.repository.InscriptionRepository;
import com.example.ski.repository.SkiRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class InscriptionServiceImpl implements IInscriptionService {
    @Autowired
    InscriptionRepository InscriptionRepository;
    @Scheduled(fixedDelay = 6000 )
    public List<Inscription> retrieveAllInscription() {

        ArrayList<Inscription> listI =(ArrayList<Inscription>) InscriptionRepository.findAll();
        log.info("nobre d Inscriptions : " + listI.size());
        for (Inscription i : listI) {
            log.info("Inscription :" + i);
        }
        return listI;
    }

    public Inscription retrieveInscription(Integer idInscription) {
        return InscriptionRepository.findById(idInscription).get();
    }

    public Inscription addInscription(Inscription p) {
        return InscriptionRepository.save(p);
    }

    public void removeInscription(Integer idInscription) {
        InscriptionRepository.deleteById(idInscription);
    }

    public Inscription modifyInscription(Inscription Inscription) {
        return InscriptionRepository.save(Inscription);
    }

}
