package com.project.techvision.services;

import com.project.techvision.domain.Receita;
import com.project.techvision.repository.ReceitaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository repo;

    public List<Receita> findAll(){
        return repo.findAll();
    }

    public Receita findById(String id){
        Optional<Receita> obj = repo.findById(id);
        return obj.orElse(null);
    }

    public Receita insert(Receita obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        repo.deleteById(id);
    }

    public List<Receita> findByUsuario(String usuarioId){
        return repo.findByUsuarioId(usuarioId);
    }
}