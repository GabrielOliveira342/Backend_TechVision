package com.project.techvision.domain.dto;

public class ItemPedidoDTO {

    private String produtoId;
    private String nomeProduto;
    private Double preco;
    private Integer quantidade;

    public ItemPedidoDTO() {
    }

    public ItemPedidoDTO(String produtoId, String nomeProduto, Double preco, Integer quantidade) {
        this.produtoId = produtoId;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getProdutoId() {
        return produtoId;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setProdutoId(String produtoId) {
        this.produtoId = produtoId;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}