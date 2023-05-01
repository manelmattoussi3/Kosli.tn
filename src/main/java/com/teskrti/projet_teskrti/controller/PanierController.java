package com.teskrti.projet_teskrti.controller;

import com.teskrti.projet_teskrti.iServices.IPanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PanierController {
    @Autowired
    private  IPanierService panierService;
}
