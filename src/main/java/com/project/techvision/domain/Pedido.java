package com.project.techvision.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "pedido")
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String usuarioId;
    private String receitaId;

    private String status;
    private LocalDateTime dataPedido;

    private Double valorTotal;
    private String enderecoEntrega;

    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(String id, String usuarioId, String receitaId, String status,
                  LocalDateTime dataPedido, Double valorTotal, String enderecoEntrega) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.receitaId = receitaId;
        this.status = status;
        this.dataPedido = dataPedido;
        this.valorTotal = valorTotal;
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getId() {
        return id;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public String getReceitaId() {
        return receitaId;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setReceitaId(String receitaId) {
        this.receitaId = receitaId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}