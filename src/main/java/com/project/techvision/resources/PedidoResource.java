package com.project.techvision.resources;

import com.project.techvision.domain.dto.PedidoDTO;
import com.project.techvision.services.PedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService service;

    @GetMapping
    public ResponseEntity<List<PedidoDTO>> findAll(){
        List<PedidoDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoDTO> findById(@PathVariable String id){
        PedidoDTO obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("/user/{usuarioId}")
    public ResponseEntity<List<PedidoDTO>> findByUsuario(@PathVariable String usuarioId){
        List<PedidoDTO> list = service.findByUsuario(usuarioId);
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<PedidoDTO> insert(@RequestBody PedidoDTO dto){
        dto = service.insert(dto);
        return ResponseEntity.ok().body(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PedidoDTO> update(@PathVariable String id, @RequestBody PedidoDTO dto){
        PedidoDTO obj = service.update(id, dto);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}