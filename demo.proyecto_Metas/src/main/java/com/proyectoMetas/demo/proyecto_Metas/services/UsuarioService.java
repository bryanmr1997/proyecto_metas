package com.proyectoMetas.demo.proyecto_Metas.services;

import com.proyectoMetas.demo.proyecto_Metas.models.Usuarios;

import java.util.List;

public interface UsuarioService {

   public Usuarios save(Usuarios usuarios);

    public List<Usuarios> findByCorreoAndPassword(String correo,String password);

//    public Usuarios findById(String Correo);
//
    public List<Usuarios> findAll();
//
//    public void delete(String  correo);
//


}
