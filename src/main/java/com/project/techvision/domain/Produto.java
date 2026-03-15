package com.project.techvision.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.project.techvision.domain.enums.TipoProduto;

import java.io.Serializable;

@Document(collection = "produto")
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String nome;
    private String descricao;
    private TipoProduto tipo;
    private Double preco;
    private String marca;
    private Integer estoque;
    private String oticaId;
    private String especificacoes;

    public Produto() {
    }

    public Produto(String id, String nome, String descricao, TipoProduto tipo, Double preco,
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

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public TipoProduto getTipo() { return tipo; }
    public void setTipo(TipoProduto tipo) { this.tipo = tipo; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public Integer getEstoque() { return estoque; }
    public void setEstoque(Integer estoque) { this.estoque = estoque; }

    public String getOticaId() { return oticaId; }
    public void setOticaId(String oticaId) { this.oticaId = oticaId; }

    public String getEspecificacoes() { return especificacoes; }
    public void setEspecificacoes(String especificacoes) { this.especificacoes = especificacoes; }
}