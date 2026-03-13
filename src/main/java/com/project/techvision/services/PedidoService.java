package com.project.techvision.services;

import com.project.techvision.domain.Pedido;
import com.project.techvision.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public List<Pedido> findAll(){
        return repo.findAll();
    }

    public Pedido findById(String id){
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElse(null);
    }

    public Pedido insert(Pedido obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        repo.deleteById(id);
    }

    public List<Pedido> findByUsuario(String usuarioId){
        return repo.findByUsuarioId(usuarioId);
    } 
}