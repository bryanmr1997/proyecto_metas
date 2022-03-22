package com.proyectoMetas.demo.proyecto_Metas.controller;


import com.proyectoMetas.demo.proyecto_Metas.models.Tareas;
import com.proyectoMetas.demo.proyecto_Metas.models.Usuarios;
import com.proyectoMetas.demo.proyecto_Metas.services.TareaService;
import com.proyectoMetas.demo.proyecto_Metas.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;


    @GetMapping("/buscar_usuario")
    public  List<Usuarios> getAllUsuario(){
        return  usuarioService.findAll();
    }

    @PostMapping("guardar_usuario")
    public Usuarios saveUsuario(@RequestBody Usuarios usuarios){
        return usuarioService.save(usuarios);
    }

    @GetMapping("/login/{correo}/{password}")
    public  String login(@PathVariable("correo") String correo,@PathVariable("password") String password){

        String login = "ERROR";

        List <Usuarios> usuarios=usuarioService.findByCorreoAndPassword(correo,password);


        if (!usuarios.isEmpty()){
            login="OK";
        }


        return  login;
    }





    //falta eliminar y borrar


}
