package com.teskrti.projet_teskrti.services;

import com.teskrti.projet_teskrti.iServices.ICategoryService;
import com.teskrti.projet_teskrti.repositories.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private  ICategoryRepository categoryRepository;
}
