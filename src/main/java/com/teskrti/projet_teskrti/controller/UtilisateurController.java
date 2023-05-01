package com.teskrti.projet_teskrti.controller;

import com.teskrti.projet_teskrti.iServices.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {
    @Autowired
    private IUserService userService;
}
