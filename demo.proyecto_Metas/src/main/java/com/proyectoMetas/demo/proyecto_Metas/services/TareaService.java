package com.proyectoMetas.demo.proyecto_Metas.services;

import com.proyectoMetas.demo.proyecto_Metas.models.Tareas;

import java.util.List;

public interface TareaService {


//    public Tareas save(Tareas tareas);



    public List <Tareas> findByUsuarioCorreo(String usuarioCorreo);

//    public List<Tareas> findAll();
//
//    public void delete(Long id);
//


}
