package com.project.techvision.domain.dto;

public class ProdutoDTO {

    private String id;
    private String nome;
    private String descricao;
    private Double preco;
    private Integer estoque;
    private String oticaId;
    private String categoria;
    private String marca;

    public ProdutoDTO() {
    }

    public ProdutoDTO(String id, String nome, String descricao, Double preco,
                      Integer estoque, String oticaId, String categoria, String marca) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
        this.oticaId = oticaId;
        this.categoria = categoria;
        this.marca = marca;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public Double getPreco() { return preco; }
    public Integer getEstoque() { return estoque; }
    public String getOticaId() { return oticaId; }
    public String getCategoria() { return categoria; }
    public String getMarca() { return marca; }

    public void setId(String id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setPreco(Double preco) { this.preco = preco; }
    public void setEstoque(Integer estoque) { this.estoque = estoque; }
    public void setOticaId(String oticaId) { this.oticaId = oticaId; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setMarca(String marca) { this.marca = marca; }
}