package com.conexion.conexionMySQL.Controllers;


import com.conexion.conexionMySQL.Models.Usuario;
import com.conexion.conexionMySQL.Services.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("getUsuarios")
    public List<Usuario> getUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping("crear")
    public Usuario crearUsuario(@RequestBody Usuario newUsuario) {
        return usuarioService.guardarUsuario(newUsuario);
    }


    @DeleteMapping("delete/{idUsuario}")
    public Long deleteUsuario(@PathVariable Long idUsuario){
        usuarioService.deleteUsuario(idUsuario);
        return idUsuario;
    }

}

