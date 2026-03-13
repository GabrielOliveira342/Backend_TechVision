package com.project.techvision.repository;

import com.project.techvision.domain.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {

    List<Produto> findByOticaId(String oticaId);

    List<Produto> findByTipo(String tipo);

}