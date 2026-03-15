package com.project.techvision.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PedidoDTO {

    private String id;

    @NotBlank(message = "O id do usuário é obrigatório")
    private String usuarioId;

    private String receitaId;

    @NotBlank(message = "O status do pedido é obrigatório")
    private String status;

    private LocalDateTime dataPedido;

    private Double valorTotal;

    @NotBlank(message = "O endereço de entrega é obrigatório")
    @Size(min = 5, message = "Endereço deve ter no mínimo 5 caracteres")
    private String enderecoEntrega;

    @NotNull(message = "O pedido deve conter itens")
    private List<ItemPedidoDTO> itens;

    public PedidoDTO() {
    }

    public PedidoDTO(String id, String usuarioId, String receitaId, String status,
                     LocalDateTime dataPedido, Double valorTotal,
                     String enderecoEntrega, List<ItemPedidoDTO> itens) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.receitaId = receitaId;
        this.status = status;
        this.dataPedido = dataPedido;
        this.valorTotal = valorTotal;
        this.enderecoEntrega = enderecoEntrega;
        this.itens = itens;
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

    public List<ItemPedidoDTO> getItens() {
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

    public void setItens(List<ItemPedidoDTO> itens) {
        this.itens = itens;
    }
}