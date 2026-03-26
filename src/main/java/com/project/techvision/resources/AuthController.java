package com.project.techvision.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.project.techvision.domain.dto.LoginDTO;
import com.project.techvision.services.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO dto) {

        boolean valido = service.validarLogin(dto.getEmail(), dto.getSenha());

        if (valido) {
            return ResponseEntity.ok("Login realizado com sucesso");
        }

        return ResponseEntity.status(401).body("Email ou senha inválidos");
    }
}