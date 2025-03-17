package com.conexion.conexionMySQL.Controllers;


import com.conexion.conexionMySQL.Models.Usuario;
import com.conexion.conexionMySQL.Services.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PostMapping("saludo")
    public String saludo(){
        return "Hello";
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

    @GetMapping("hiWord")
    public String hiWorld(){
        return "Hello Word";
    }

    @GetMapping("getUser/{id}")
    public Optional<Usuario> getUserId(@PathVariable Long id){
        return usuarioService.getUserId(id);
    }

    @GetMapping("despedida")
    public String despedida(){
        return "adios";
    }

    @GetMapping("ByeWord")
    public String ByWord(){
        return "Bye Word";
    }

    @GetMapping("restar/{num}")
    public int Restar(@PathVariable int num){
        return num+5;
    }
    @GetMapping("sumar{num}")
    public int sumar(@PathVariable int num){
        return num+5;
    }
}

