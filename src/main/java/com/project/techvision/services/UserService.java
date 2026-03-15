package com.project.techvision.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.project.techvision.domain.User;
import com.project.techvision.domain.dto.UserDTO;
import com.project.techvision.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    // LISTAR
    public List<UserDTO> findAll() {
        List<User> list = repo.findAll();
        return list.stream().map(this::toDTO).collect(Collectors.toList());
    }

    // BUSCAR POR ID
    public UserDTO findById(String id){
        Optional<User> obj = repo.findById(id);
        return toDTO(obj.orElseThrow());
    }

    // INSERIR
    public User insert(UserDTO dto){
        User obj = fromDTO(dto);
        obj.setDataCadastro(LocalDateTime.now());
        return repo.insert(obj);
    }

    // ATUALIZAR
    public User update(String id, UserDTO dto){
        Optional<User> obj = repo.findById(id);
        User user = obj.orElseThrow();

        updateData(user, dto);

        return repo.save(user);
    }

    // DELETAR
    public void delete(String id){
        Optional<User> obj = repo.findById(id);
        obj.orElseThrow();
        repo.deleteById(id);
    }

    private void updateData(User user, UserDTO dto){
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        user.setEndereco(dto.getEndereco());
        user.setTipoUsuario(dto.getTipoUsuario());

        if(dto.getPassword() != null){
            user.setPassword(dto.getPassword());
        }
    }

    // Converter DTO → Entity
    private User fromDTO(UserDTO dto){
        User user = new User();

        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        user.setPassword(dto.getPassword());
        user.setTipoUsuario(dto.getTipoUsuario());
        user.setEndereco(dto.getEndereco());

        return user;
    }

    // Converter Entity → DTO
    private UserDTO toDTO(User user){
        return new UserDTO(
            user.getId(),
            user.getName(),
            user.getEmail(),
            user.getPhone(),
            user.getTipoUsuario(),
            user.getEndereco(),
            user.getDataCadastro()
        );
    }
}