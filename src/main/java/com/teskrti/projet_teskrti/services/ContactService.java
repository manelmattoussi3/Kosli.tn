package com.teskrti.projet_teskrti.services;

import com.teskrti.projet_teskrti.iServices.IContactService;
import com.teskrti.projet_teskrti.repositories.IContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService implements IContactService {
   @Autowired
   private  IContactRepository contactRepository;
}
