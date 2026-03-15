package com.project.techvision.domain;

import com.project.techvision.domain.dto.PedidoDTO;

import java.time.LocalDateTime;

public class Pedido {

    private String id;
    private String usuarioId;
    private String receitaId;
    private String status;
    private LocalDateTime dataPedido;
    private Double valorTotal;
    private String enderecoEntrega;

    public Pedido() {
    }

    public Pedido(PedidoDTO dto) {
        this.id = dto.getId();
        this.usuarioId = dto.getUsuarioId();
        this.receitaId = dto.getReceitaId();
        this.status = dto.getStatus();
        this.dataPedido = dto.getDataPedido();
        this.valorTotal = dto.getValorTotal();
        this.enderecoEntrega = dto.getEnderecoEntrega();
    }

    public PedidoDTO toDTO() {
        return new PedidoDTO(
                this.id,
                this.usuarioId,
                this.receitaId,
                this.status,
                this.dataPedido,
                this.valorTotal,
                this.enderecoEntrega,
                null);
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
}