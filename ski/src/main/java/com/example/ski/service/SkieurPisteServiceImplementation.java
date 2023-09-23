package com.example.ski.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ski.entity.Piste;
import com.example.ski.entity.Skieur;
import com.example.ski.repository.PisteRepository;
import com.example.ski.repository.SkiRepository;

@Service
public class SkieurPisteServiceImplementation implements ISkieurPisteService {
    @Autowired
    PisteRepository PR;
    @Autowired
    SkiRepository SR;
    public void  AffectSkieurPiste(int SI, int PI)
    {
        Skieur S = SR.findById(SI).get();
        Piste P = PR.findById(PI).get();
        S.getPistes().add(P);
        SR.save(S);

    }
    public void  DesAffectSkieurPiste(int SI, int PI){
        Skieur S = SR.findById(SI).get();
        Piste P = PR.findById(PI).get();
        S.getPistes().remove(P);
        SR.save(S);
    }
}
