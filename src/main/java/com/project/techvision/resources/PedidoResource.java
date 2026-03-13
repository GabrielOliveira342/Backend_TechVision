package com.project.techvision.resources;

import com.project.techvision.domain.Pedido;
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
    public ResponseEntity<List<Pedido>> findAll(){
        List<Pedido> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable String id){
        Pedido obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("/user/{usuarioId}")
    public ResponseEntity<List<Pedido>> findByUsuario(@PathVariable String usuarioId){
        List<Pedido> list = service.findByUsuario(usuarioId);
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Pedido> insert(@RequestBody Pedido obj){
        obj = service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }
}