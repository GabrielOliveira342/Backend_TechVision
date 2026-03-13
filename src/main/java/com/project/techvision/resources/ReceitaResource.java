package com.project.techvision.resources;

import com.project.techvision.domain.Receita;
import com.project.techvision.services.ReceitaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/receitas")
public class ReceitaResource {

    @Autowired
    private ReceitaService service;

    @GetMapping
    public ResponseEntity<List<Receita>> findAll(){
        List<Receita> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Receita> findById(@PathVariable String id){
        Receita obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("/user/{usuarioId}")
    public ResponseEntity<List<Receita>> findByUsuario(@PathVariable String usuarioId){
        List<Receita> list = service.findByUsuario(usuarioId);
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Receita> insert(@RequestBody Receita obj){
        obj = service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }
}