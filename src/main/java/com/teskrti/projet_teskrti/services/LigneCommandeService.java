package com.teskrti.projet_teskrti.services;

import com.teskrti.projet_teskrti.iServices.ILigneCommandeService;
import com.teskrti.projet_teskrti.repositories.ILigneCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LigneCommandeService implements ILigneCommandeService {
    @Autowired
    private ILigneCommandeRepository ligneCommandeRepository;
}
