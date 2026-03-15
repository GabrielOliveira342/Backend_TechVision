package com.project.techvision.resources;

import com.project.techvision.domain.dto.ProdutoDTO;
import com.project.techvision.domain.enums.TipoProduto;
import com.project.techvision.services.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> findById(@PathVariable String id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/otica/{oticaId}")
    public ResponseEntity<List<ProdutoDTO>> findByOtica(@PathVariable String oticaId){
        return ResponseEntity.ok(service.findByOtica(oticaId));
    }

    @GetMapping("/tipo/{tipo}")
    public ResponseEntity<List<ProdutoDTO>> findByTipo(@PathVariable TipoProduto tipo){
        return ResponseEntity.ok(service.findByTipo(tipo));
    }

    @PostMapping
    public ResponseEntity<ProdutoDTO> insert(@RequestBody ProdutoDTO dto){
        return ResponseEntity.ok(service.insert(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoDTO> update(@PathVariable String id, @RequestBody ProdutoDTO dto){
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}