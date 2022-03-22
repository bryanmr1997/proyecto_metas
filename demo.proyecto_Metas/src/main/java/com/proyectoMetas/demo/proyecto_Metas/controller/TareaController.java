package com.proyectoMetas.demo.proyecto_Metas.controller;


import com.proyectoMetas.demo.proyecto_Metas.models.Tareas;
import com.proyectoMetas.demo.proyecto_Metas.models.Usuarios;
import com.proyectoMetas.demo.proyecto_Metas.services.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tareas")
public class TareaController {


    @Autowired
    private TareaService tareaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Tareas>> listaUsuarios(){
        return new ResponseEntity<>(tareaService.findAll(), HttpStatus.OK);
    }



    @GetMapping("/{id}")
    public ResponseEntity<Tareas> obtenerUsuarios(@PathVariable Long id){
        return new ResponseEntity<>(tareaService.findById(id),HttpStatus.OK);
    }


    @PostMapping("/crear")
    // EL REQUEST BODY CONVIERTE EL JSON EN CLASE PJP PRODUCTS
    public ResponseEntity<Tareas> crearTarea(@RequestBody Tareas tareas){
        return new ResponseEntity<>(tareaService.save(tareas),HttpStatus.CREATED);
    }
}
