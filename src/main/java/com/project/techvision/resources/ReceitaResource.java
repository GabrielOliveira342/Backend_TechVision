package com.project.techvision.resources;

import com.project.techvision.domain.dto.ReceitaDTO;
import com.project.techvision.services.ReceitaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/receitas")
public class ReceitaResource {

    @Autowired
    private ReceitaService service;

    @GetMapping
    public ResponseEntity<List<ReceitaDTO>> findAll(){
        List<ReceitaDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReceitaDTO> findById(@PathVariable String id){
        ReceitaDTO obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("/user/{usuarioId}")
    public ResponseEntity<List<ReceitaDTO>> findByUsuario(@PathVariable String usuarioId){
        List<ReceitaDTO> list = service.findByUsuario(usuarioId);
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<ReceitaDTO> insert(@Valid @RequestBody ReceitaDTO dto){
        ReceitaDTO obj = service.insert(dto);
        return ResponseEntity.ok().body(obj);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReceitaDTO> update(@PathVariable String id, @RequestBody ReceitaDTO dto){
        ReceitaDTO obj = service.update(id, dto);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}