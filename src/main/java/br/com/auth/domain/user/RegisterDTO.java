package br.com.auth.domain.user;

public record RegisterDTO(String login, String nome, String password, UserRole role) {
}
