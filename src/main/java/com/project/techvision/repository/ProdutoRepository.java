package com.project.techvision.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.techvision.domain.Produto;
import com.project.techvision.domain.enums.TipoProduto;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {

    List<Produto> findByOticaId(String oticaId);

    List<Produto> findByTipo(TipoProduto tipo);

}