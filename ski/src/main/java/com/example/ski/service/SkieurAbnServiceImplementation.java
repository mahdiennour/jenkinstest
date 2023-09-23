package com.example.ski.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ski.entity.Abonnement;
import com.example.ski.entity.Skieur;
import com.example.ski.repository.AbonnementRepository;
import com.example.ski.repository.SkiRepository;

@Service
public class SkieurAbnServiceImplementation implements ISkieurAbnService{
    @Autowired
    SkiRepository SR;
    @Autowired
    AbonnementRepository AR;
    public void AffectSkieurAbn(int Sid, int Aid)
    {
        Skieur S=SR.findById(Sid).get();
        Abonnement A=AR.findById(Aid).get();
        S.setAbonnement(A);
        SR.save(S);
    }
    public Skieur CreateSkieurAffectAbn(Skieur S, int Aid)
    {
        Abonnement A = AR.findById(Aid).get();
        S.setAbonnement(A);
        return SR.save(S);
    }
    public Skieur addSkieurandAbonnementAffect(Skieur S) { return SR.save(S); }
    public void DesafecterSkieurAbn(int Sid)
    {
        Skieur S=SR.findById(Sid).get();
        S.setAbonnement(null);
        SR.save(S);
    }

}
