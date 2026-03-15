package com.project.techvision.services;

import com.project.techvision.domain.Receita;
import com.project.techvision.domain.dto.ReceitaDTO;
import com.project.techvision.repository.ReceitaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository repo;

    public List<ReceitaDTO> findAll(){
        List<Receita> list = repo.findAll();
        return list.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public ReceitaDTO findById(String id){
        Optional<Receita> obj = repo.findById(id);
        return toDTO(obj.orElseThrow());
    }

    public ReceitaDTO insert(ReceitaDTO dto){
        Receita obj = fromDTO(dto);
        obj.setDataEmissao(LocalDateTime.now());
        obj = repo.insert(obj);
        return toDTO(obj);
    }

    public ReceitaDTO update(String id, ReceitaDTO dto){
        Optional<Receita> obj = repo.findById(id);
        Receita receita = obj.orElseThrow();

        updateData(receita, dto);

        receita = repo.save(receita);
        return toDTO(receita);
    }

    public void delete(String id){
        repo.deleteById(id);
    }

    public List<ReceitaDTO> findByUsuario(String usuarioId){
        List<Receita> list = repo.findByUsuarioId(usuarioId);
        return list.stream().map(this::toDTO).collect(Collectors.toList());
    }

    // Atualizar campos
    private void updateData(Receita receita, ReceitaDTO dto){
        receita.setUsuarioId(dto.getUsuarioId());
        receita.setImagemReceita(dto.getImagemReceita());
        receita.setOlhoDireito(dto.getOlhoDireito());
        receita.setOlhoEsquerdo(dto.getOlhoEsquerdo());
        receita.setMedico(dto.getMedico());
        receita.setObservacoes(dto.getObservacoes());
    }

    // DTO → Entity
    private Receita fromDTO(ReceitaDTO dto){
        Receita receita = new Receita();

        receita.setId(dto.getId());
        receita.setUsuarioId(dto.getUsuarioId());
        receita.setImagemReceita(dto.getImagemReceita());
        receita.setOlhoDireito(dto.getOlhoDireito());
        receita.setOlhoEsquerdo(dto.getOlhoEsquerdo());
        receita.setDataEmissao(dto.getDataEmissao());
        receita.setMedico(dto.getMedico());
        receita.setObservacoes(dto.getObservacoes());

        return receita;
    }

    // Entity → DTO
    private ReceitaDTO toDTO(Receita receita){
        return new ReceitaDTO(
            receita.getId(),
            receita.getUsuarioId(),
            receita.getImagemReceita(),
            receita.getOlhoDireito(),
            receita.getOlhoEsquerdo(),
            receita.getDataEmissao(),
            receita.getMedico(),
            receita.getObservacoes()
        );
    }
}