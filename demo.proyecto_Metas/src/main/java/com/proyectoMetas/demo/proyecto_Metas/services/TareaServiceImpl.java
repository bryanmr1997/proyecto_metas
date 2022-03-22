package com.proyectoMetas.demo.proyecto_Metas.services;

import com.proyectoMetas.demo.proyecto_Metas.dao.TareasDao;
import com.proyectoMetas.demo.proyecto_Metas.models.Tareas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServiceImpl implements TareaService{

    @Autowired
    private TareasDao tareasDao;

   // @Override
   // public Tareas save(Tareas tareas) {
    //    return tareasDao.save(tareas);
   // }

    @Override
    public List<Tareas> findByUsuarioCorreo(String usuarioCorreo) {
        return null;
    }

//    @Override
//    public List<Tareas> findAll() {
//        return tareasDao.findAll();
//    }
//
//    @Override
//    public void delete(Long id) {
//
//        tareasDao.deleteById(id);
//    }
}
