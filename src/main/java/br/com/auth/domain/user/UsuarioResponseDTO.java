package br.com.auth.domain.user;

public record UsuarioResponseDTO(String id,String login,String nome,String role) {
    public UsuarioResponseDTO(User user) {
        this(user.getId(), user.getLogin(), user.getNome(), user.getRole().toString());
    }
}
