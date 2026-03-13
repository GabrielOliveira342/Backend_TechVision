package com.project.techvision.domain.dto;

import com.project.techvision.domain.enums.TipoUsuario;
import java.time.LocalDateTime;

import jakarta.validation.constraints.*;

public class UserDTO {

    private String id;

    @NotBlank
    private String name;

    @Email
    private String email;

    @Size(min = 6)
    private String password;

    @NotBlank
    private String phone;

    private TipoUsuario tipoUsuario;
    private String endereco;
    private LocalDateTime dataCadastro;

    public UserDTO() {
    }

    public UserDTO(String id, String name, String email, String phone,
                   TipoUsuario tipoUsuario, String endereco, LocalDateTime dataCadastro) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.tipoUsuario = tipoUsuario;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
    }

    public String getId() { 
        return id; }
    
    public String getName() { 
        return name; }
    
    public String getEmail() { 
        return email; }
    
    public String getPhone() { 
        return phone; }
    
    public TipoUsuario getTipoUsuario() {
         return tipoUsuario; }
    
     public String getEndereco() {
         return endereco; }
    
     public LocalDateTime getDataCadastro() { 
        return dataCadastro; }

    public void setId(String id) { 
        this.id = id; }
    
    public void setName(String name) { 
        this.name = name; }
    
    public void setEmail(String email) { 
        this.email = email; }
    
    public void setPhone(String phone) { 
        this.phone = phone; }
    
    public void setTipoUsuario(TipoUsuario tipoUsuario) { 
        this.tipoUsuario = tipoUsuario; }
    
    public void setEndereco(String endereco) { 
        this.endereco = endereco; }
    
    public void setDataCadastro(LocalDateTime dataCadastro) { 
        this.dataCadastro = dataCadastro; }
}