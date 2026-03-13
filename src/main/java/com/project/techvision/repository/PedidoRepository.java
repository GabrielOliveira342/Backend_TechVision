package com.project.techvision.repository;

import com.project.techvision.domain.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends MongoRepository<Pedido, String> {

    List<Pedido> findByUsuarioId(String usuarioId);

}