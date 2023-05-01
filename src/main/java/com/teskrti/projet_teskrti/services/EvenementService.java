package com.teskrti.projet_teskrti.services;

import com.teskrti.projet_teskrti.iServices.IEvenementService;
import com.teskrti.projet_teskrti.repositories.IEvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvenementService implements IEvenementService {
    @Autowired
    private  IEvenementRepository evenementRepository;
}
