package com.example.ski.service;

import com.example.ski.entity.Abonnement;
import com.example.ski.entity.Skieur;


public interface ISkieurAbnService {
    public void AffectSkieurAbn(int Sid, int Aid);
    public Skieur CreateSkieurAffectAbn(Skieur S, int Aid);
    public Skieur addSkieurandAbonnementAffect(Skieur S);
    public void DesafecterSkieurAbn(int Sid);

}
