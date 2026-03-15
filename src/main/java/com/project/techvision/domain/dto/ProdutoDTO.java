package com.project.techvision.domain.dto;

import com.project.techvision.domain.enums.TipoProduto;

public class ProdutoDTO {

    private String id;
    private String nome;
    private String descricao;
    private TipoProduto tipo;
    private Double preco;
    private String marca;
    private Integer estoque;
    private String oticaId;
    private String especificacoes;

    public ProdutoDTO() {
    }

    public ProdutoDTO(String id, String nome, String descricao, TipoProduto tipo, Double preco,
            String marca, Integer estoque, String oticaId, String especificacoes) {

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.preco = preco;
        this.marca = marca;
        this.estoque = estoque;
        this.oticaId = oticaId;
        this.especificacoes = especificacoes;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public String getOticaId() {
        return oticaId;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public void setOticaId(String oticaId) {
        this.oticaId = oticaId;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }
}