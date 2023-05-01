package com.teskrti.projet_teskrti.controller;

import com.teskrti.projet_teskrti.iServices.ILigneCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LigneCommandeController {
    @Autowired
    private  ILigneCommandeService ligneCommandeService;
}
