package com.example.ski.service;

import com.example.ski.entity.Piste;
import com.example.ski.repository.PisteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PisteServiceImpl implements IPisteService {
    @Autowired
    PisteRepository pisteRepository;
    @Scheduled(fixedDelay = 5000 )
    public List<Piste> retrieveAllPistes() {

       ArrayList<Piste> listP =(ArrayList<Piste>) pisteRepository.findAll();
       log.info("nobre de piste : " + listP.size());
       for (Piste p : listP) {
           log.info("Piste :" + p);
       }
       return listP;
    }


    public Piste retrievePiste(Integer pisteId) {
        return pisteRepository.findById(pisteId).get();
    }

    public Piste addPiste(Piste p) {
        return pisteRepository.save(p);
    }

    public void removePiste(Integer pisteId) {
        pisteRepository.deleteById(pisteId);
    }

    public Piste modifyPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

}
