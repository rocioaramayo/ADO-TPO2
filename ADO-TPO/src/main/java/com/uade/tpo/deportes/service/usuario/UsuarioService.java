package com.uade.tpo.deportes.service.usuario;

import com.uade.tpo.deportes.dto.*;
import com.uade.tpo.deportes.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    // Métodos de autenticación
    AuthenticationResponse registrarUsuario(RegisterRequest request);
    AuthenticationResponse login(LoginRequest request);
    
    // Gestión de perfil
    UsuarioResponse obtenerPerfil(String email);
    UsuarioResponse actualizarPerfil(String email, ActualizarPerfilRequest request);
    
    // Búsquedas
    List<UsuarioResponse> buscarUsuarios(CriteriosBusquedaUsuario criterios);
    Usuario obtenerUsuarioPorId(Long id);
    Usuario obtenerUsuarioPorEmail(String email);
    
    // Estadísticas
    EstadisticasUsuarioResponse obtenerEstadisticas(String email);
}