package com.proyectoMetas.demo.proyecto_Metas.services;

import com.proyectoMetas.demo.proyecto_Metas.dao.UsuariosDao;
import com.proyectoMetas.demo.proyecto_Metas.models.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuariosDao usuariosDao;

    @Override
    public Usuarios save(Usuarios usuarios) {
       return usuariosDao.save(usuarios);
    }

    @Override
    public List<Usuarios> findByCorreoAndPassword(String correo, String password) {
        return null;
    }

//    @Override
//    public Usuarios findById(String correo) {
//        return usuariosDao.findById(correo).orElse(null);
//    }

   @Override
   public List<Usuarios> findAll() {
        return usuariosDao.findAll();
    }
//
//    @Override
//    public void delete(String correo) {
//            usuariosDao.deleteById(correo);
//    }
}
