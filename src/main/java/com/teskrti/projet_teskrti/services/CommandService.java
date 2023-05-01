package com.teskrti.projet_teskrti.services;

import com.teskrti.projet_teskrti.iServices.ICommandeService;
import com.teskrti.projet_teskrti.repositories.ICommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandService implements ICommandeService {
    @Autowired
    private  ICommandeRepository commandeRepository;
}
