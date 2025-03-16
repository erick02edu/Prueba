package com.conexion.conexionMySQL.Services;


import com.conexion.conexionMySQL.Models.Usuario;
import com.conexion.conexionMySQL.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }

    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario guardarUsuario(Usuario newUsuario){
        return usuarioRepository.save(newUsuario);
    }

    public Long deleteUsuario(Long idUsuario){
        usuarioRepository.deleteById(idUsuario);
        return idUsuario;
    }

    public Optional<Usuario> getUserId(Long id){
        return usuarioRepository.findById(id);
    }

}
