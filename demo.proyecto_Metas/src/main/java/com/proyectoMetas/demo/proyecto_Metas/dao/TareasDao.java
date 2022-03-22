package com.proyectoMetas.demo.proyecto_Metas.dao;

import com.proyectoMetas.demo.proyecto_Metas.models.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareasDao extends JpaRepository<Tareas,Long> {
}
