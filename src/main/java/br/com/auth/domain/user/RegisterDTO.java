package br.com.auth.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
