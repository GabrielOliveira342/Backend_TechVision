package com.project.techvision.resources;

import com.project.techvision.domain.Produto;
import com.project.techvision.services.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResource {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<Produto>> findAll(){
        List<Produto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> findById(@PathVariable String id){
        Produto obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("/otica/{oticaId}")
    public ResponseEntity<List<Produto>> findByOtica(@PathVariable String oticaId){
        List<Produto> list = service.findByOtica(oticaId);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/tipo/{tipo}")
    public ResponseEntity<List<Produto>> findByTipo(@PathVariable String tipo){
        List<Produto> list = service.findByTipo(tipo);
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Produto> insert(@RequestBody Produto obj){
        obj = service.insert(obj);
        return ResponseEntity.status(201).body(obj);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> update(@PathVariable String id, @RequestBody Produto obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}