package br.com.auth.controllers;

import br.com.auth.domain.product.ProductResponseDTO;
import br.com.auth.domain.user.UsuarioResponseDTO;
import br.com.auth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuariosController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/findAll")
    public ResponseEntity findAll() {
        List<UsuarioResponseDTO> list = repository.findAll().stream()
                .map(UsuarioResponseDTO::new)
                .toList();
        return ResponseEntity.ok(list);

    }
}

