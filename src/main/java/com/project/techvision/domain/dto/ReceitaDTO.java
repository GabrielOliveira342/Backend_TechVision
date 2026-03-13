package com.project.techvision.domain.dto;

import java.time.LocalDateTime;

public class ReceitaDTO {

    private String id;
    private String usuarioId;
    private String imagemReceita;
    private String olhoDireito;
    private String olhoEsquerdo;
    private LocalDateTime dataEmissao;
    private String medico;
    private String observacoes;

    public ReceitaDTO() {
    }

    public ReceitaDTO(String id, String usuarioId, String imagemReceita,
                      String olhoDireito, String olhoEsquerdo,
                      LocalDateTime dataEmissao, String medico, String observacoes) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.imagemReceita = imagemReceita;
        this.olhoDireito = olhoDireito;
        this.olhoEsquerdo = olhoEsquerdo;
        this.dataEmissao = dataEmissao;
        this.medico = medico;
        this.observacoes = observacoes;
    }

    public String getId() { return id; }
    public String getUsuarioId() { return usuarioId; }
    public String getImagemReceita() { return imagemReceita; }
    public String getOlhoDireito() { return olhoDireito; }
    public String getOlhoEsquerdo() { return olhoEsquerdo; }
    public LocalDateTime getDataEmissao() { return dataEmissao; }
    public String getMedico() { return medico; }
    public String getObservacoes() { return observacoes; }

    public void setId(String id) { this.id = id; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }
    public void setImagemReceita(String imagemReceita) { this.imagemReceita = imagemReceita; }
    public void setOlhoDireito(String olhoDireito) { this.olhoDireito = olhoDireito; }
    public void setOlhoEsquerdo(String olhoEsquerdo) { this.olhoEsquerdo = olhoEsquerdo; }
    public void setDataEmissao(LocalDateTime dataEmissao) { this.dataEmissao = dataEmissao; }
    public void setMedico(String medico) { this.medico = medico; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
}