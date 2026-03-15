package com.project.techvision.services;

import com.project.techvision.domain.Pedido;
import com.project.techvision.domain.dto.PedidoDTO;
import com.project.techvision.repository.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public List<PedidoDTO> findAll(){
        return repo.findAll()
                .stream()
                .map(Pedido::toDTO)
                .collect(Collectors.toList());
    }

    public PedidoDTO findById(String id){
        Pedido obj = repo.findById(id).orElse(null);
        return obj != null ? obj.toDTO() : null;
    }

    public PedidoDTO insert(PedidoDTO dto){
        Pedido obj = new Pedido(dto);
        obj = repo.insert(obj);
        return obj.toDTO();
    }

    public PedidoDTO update(String id, PedidoDTO dto){
        Pedido obj = repo.findById(id).orElse(null);

        if(obj == null){
            return null;
        }

        obj.setUsuarioId(dto.getUsuarioId());
        obj.setReceitaId(dto.getReceitaId());
        obj.setStatus(dto.getStatus());
        obj.setDataPedido(dto.getDataPedido());
        obj.setValorTotal(dto.getValorTotal());
        obj.setEnderecoEntrega(dto.getEnderecoEntrega());

        obj = repo.save(obj);

        return obj.toDTO();
    }

    public void delete(String id){
        repo.deleteById(id);
    }

    public List<PedidoDTO> findByUsuario(String usuarioId){
        return repo.findByUsuarioId(usuarioId)
                .stream()
                .map(Pedido::toDTO)
                .collect(Collectors.toList());
    }
}