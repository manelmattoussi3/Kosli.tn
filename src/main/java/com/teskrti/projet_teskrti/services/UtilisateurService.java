package com.teskrti.projet_teskrti.services;

import com.teskrti.projet_teskrti.iServices.IUserService;
import com.teskrti.projet_teskrti.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService implements IUserService {
    @Autowired
    private  IUserRepository userRepository;
}
