package com.project.techvision.repository;

import com.project.techvision.domain.Receita;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceitaRepository extends MongoRepository<Receita, String> {

    List<Receita> findByUsuarioId(String usuarioId);

}