package com.cursospring.catalog.resources;

import java.util.List;
import java.util.ArrayList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursospring.catalog.entities.Category;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @RequestMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = new ArrayList<>();
        list.add(new Category(1L, "Eletronics"));
        list.add(new Category(2L, "Books"));
        return ResponseEntity.ok().body(list);
    }

    
}
