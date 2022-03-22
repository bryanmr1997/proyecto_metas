package com.proyectoMetas.demo.proyecto_Metas.controller;

import com.proyectoMetas.demo.proyecto_Metas.dao.RolDao;
import com.proyectoMetas.demo.proyecto_Metas.models.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/roles")
public class RolController {

    @Autowired
    RolDao rolDao;

    @PostMapping("/guardar")
    public Rol saveRol(@RequestBody Rol rol){
        return rolDao.save(rol);
    }


}
