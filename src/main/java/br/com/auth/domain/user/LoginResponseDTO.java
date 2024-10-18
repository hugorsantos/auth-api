package br.com.auth.domain.user;

public record LoginResponseDTO(String token, UsuarioResponseDTO user) {
}
