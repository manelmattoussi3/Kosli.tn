package com.teskrti.projet_teskrti.services;

import com.teskrti.projet_teskrti.iServices.IPanierService;
import com.teskrti.projet_teskrti.repositories.IPanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanierService implements IPanierService {
    @Autowired
    private IPanierRepository panierRepository;
}
