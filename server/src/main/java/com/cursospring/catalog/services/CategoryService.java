package com.cursospring.catalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursospring.catalog.entities.Category;
import com.cursospring.catalog.repositories.CategoryRepository;


@Service
public class CategoryService {

    @Autowired    
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }    
    
}
