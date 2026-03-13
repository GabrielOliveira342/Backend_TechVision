package com.project.techvision.services;

import com.project.techvision.domain.Produto;
import com.project.techvision.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repo;

    public List<Produto> findAll(){
        return repo.findAll();
    }

    public Produto findById(String id){
        Optional<Produto> obj = repo.findById(id);
        return obj.orElse(null);
    }

    public Produto insert(Produto obj){
        return repo.insert(obj);
    }

    public Produto update(String id, Produto obj){
        Produto newObj = findById(id);

        newObj.setNome(obj.getNome());
        newObj.setDescricao(obj.getDescricao());
        newObj.setTipo(obj.getTipo());
        newObj.setPreco(obj.getPreco());
        newObj.setMarca(obj.getMarca());
        newObj.setEstoque(obj.getEstoque());
        newObj.setOticaId(obj.getOticaId());
        newObj.setEspecificacoes(obj.getEspecificacoes());

        return repo.save(newObj);
    }

    public void delete(String id){
        repo.deleteById(id);
    }

    public List<Produto> findByOtica(String oticaId){
        return repo.findByOticaId(oticaId);
    }

    public List<Produto> findByTipo(String tipo){
        return repo.findByTipo(tipo);
    }
}