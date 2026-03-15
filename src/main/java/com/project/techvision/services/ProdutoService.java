package com.project.techvision.services;

import com.project.techvision.domain.Produto;
import com.project.techvision.domain.dto.ProdutoDTO;
import com.project.techvision.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repo;

    public List<ProdutoDTO> findAll(){
        return repo.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    public ProdutoDTO findById(String id){
        Optional<Produto> obj = repo.findById(id);
        return toDTO(obj.orElseThrow());
    }

    public ProdutoDTO insert(ProdutoDTO dto){
        Produto produto = fromDTO(dto);
        produto = repo.insert(produto);
        return toDTO(produto);
    }

    public ProdutoDTO update(String id, ProdutoDTO dto){
        Produto produto = repo.findById(id).orElseThrow();
        updateData(produto, dto);
        produto = repo.save(produto);
        return toDTO(produto);
    }

    public void delete(String id){
        repo.deleteById(id);
    }

    public List<ProdutoDTO> findByOtica(String oticaId){
        return repo.findByOticaId(oticaId).stream().map(this::toDTO).collect(Collectors.toList());
    }

    public List<ProdutoDTO> findByTipo(com.project.techvision.domain.enums.TipoProduto tipo){
        return repo.findByTipo(tipo).stream().map(this::toDTO).collect(Collectors.toList());
    }

    private Produto fromDTO(ProdutoDTO dto){
        return new Produto(
                dto.getId(),
                dto.getNome(),
                dto.getDescricao(),
                dto.getTipo(),
                dto.getPreco(),
                dto.getMarca(),
                dto.getEstoque(),
                dto.getOticaId(),
                dto.getEspecificacoes()
        );
    }

    private ProdutoDTO toDTO(Produto produto){
        return new ProdutoDTO(
                produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getTipo(),
                produto.getPreco(),
                produto.getMarca(),
                produto.getEstoque(),
                produto.getOticaId(),
                produto.getEspecificacoes()
        );
    }

    private void updateData(Produto produto, ProdutoDTO dto){
        produto.setNome(dto.getNome());
        produto.setDescricao(dto.getDescricao());
        produto.setTipo(dto.getTipo());
        produto.setPreco(dto.getPreco());
        produto.setMarca(dto.getMarca());
        produto.setEstoque(dto.getEstoque());
        produto.setOticaId(dto.getOticaId());
        produto.setEspecificacoes(dto.getEspecificacoes());
    }
}