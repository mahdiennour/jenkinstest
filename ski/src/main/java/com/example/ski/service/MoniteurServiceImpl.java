package com.example.ski.service;

import com.example.ski.entity.Moniteur;
import com.example.ski.repository.MoniteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoniteurServiceImpl implements IMonitorService {
    @Autowired
    MoniteurRepository MoniteurRepository;

    public List<Moniteur> retrieveAllMonitors() {
       return MoniteurRepository.findAll();
    }

    public Moniteur retrieveMoniteur(Integer idMoniteur) {
        return MoniteurRepository.findById(idMoniteur).get();
    }

    public Moniteur addMoniteur(Moniteur p) {
        return MoniteurRepository.save(p);
    }

    public void removeMoniteur(Integer idMoniteur) {
        MoniteurRepository.deleteById(idMoniteur);
    }

    public Moniteur modifyMoniteur(Moniteur moniteur) {
        return MoniteurRepository.save(moniteur);
    }

}
